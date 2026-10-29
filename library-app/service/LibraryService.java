package service;

import model.Book;
import model.Loan;
import model.Member;
import notifier.Notifier;

import java.awt.event.KeyListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LibraryService {
    // Danh Sách
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();
    private Notifier notifier;

    public LibraryService(Notifier notifier){
        this.notifier = notifier;
    }

    // Thêm Book, Member
    public void addBook(Book book){
        if(book == null){
            throw new IllegalArgumentException("Lỗi : Book Không Hợp Lệ");
        }
        books.add(book);
        System.out.printf("-> Thêm Book " + book.getTilte() + " Thành Công <-");
    }

    public void addMember(Member member){
        if(member == null){
            throw new IllegalArgumentException("Lỗi : Member Không Hợp Lệ ");
        }
        members.add(member);
        System.out.printf("-> Thêm Người Dùng " + member.getName() + " Thành Công ");
    }

    private Member findMember(String idMember){
        for(Member m : members){
            if(m.getId().equals(idMember)){
                return m;
            }
        }
        throw new IllegalArgumentException("Lỗi : Không Có Bạn Đọc " + idMember);
    }

    private Book findBook(String isbn){
        for(Book b : books){
            if(b.getIsbn().equals(isbn)){
                return b;
            }
        }
        throw new IllegalArgumentException("Lỗi : Không Có " +isbn+ " Book ");
    }

    private int  activeLoanCount(String memberID){
        int count = 0;
       for(Loan l : loans){
           if(l.getMeberId().equals(memberID)){
               count++;
           }
       }
       if(count != 0){
           return count;
       }
       throw new IllegalArgumentException("Lỗi : " + memberID + " Không Có Khoảng Vay");
    }


    public Loan borrow(String memberId, String isbn){
        Member member = findMember(memberId);
        Book book  = findBook(isbn);

        if(!book.hasAvailableCopy()){
            throw new IllegalArgumentException("Lỗi : Sách Đã Hết Bản Sao : " + isbn);
        }
        if(activeLoanCount(memberId) >= member.maxBook()){
            throw new IllegalArgumentException(member.getName() + " đã mượn tối đa " + member.maxBook() + " cuốn");
        }

        book.takeCopy();
        Loan loan = new Loan(memberId, isbn, LocalDate.now());
        loans.add(loan);
        notifier.send(member.getName(), " Bạn Đã Mượn " +book.getTilte()+ ", [Hạn Trả] : " + loan.dueDate());
        return loan;

    }

    public long giveBack(String memberId, String isbn, LocalDate returnedOn){
        Member member = findMember(memberId);
        Loan loan = borrow(memberId, isbn);
        Book book = findBook(isbn);
        long lateDays = loan.lacalDays(returnedOn);
        double fee = member.calculateLateFee((int) lateDays);


        loans.remove(loan);
        book.returnCopy();
        notifier.send(member.getName(), "Đã Trả " +book.getTilte());
        return (long) fee;
    }

    public List<Book> search(String keyword){
        if(keyword == null || keyword.trim().isEmpty()){
            return new ArrayList<>();
        }
        String lowerkeyword = keyword.toLowerCase(Locale.ROOT);
        List<Book> result = new ArrayList<>();
        for(Book b : books){
            if(b.getTilte() != null && b.getTilte().toLowerCase(Locale.ROOT).contains(lowerkeyword)){
                result.add(b);
            }
        }
        return result;
    }

    public int availableCopies(String isbn){
        if(isbn == null || isbn.trim().isEmpty()){
            throw new IllegalArgumentException("Lỗi : ID Book Tìm Kiếm Không Hợp Lệ");
        }
        Book book = null;

        for(Book b : books){
            if(b.getIsbn().toLowerCase(Locale.ROOT).equals(isbn.toLowerCase(Locale.ROOT))){
                book = b;
                break;
            }
        }
        if(book == null){
            throw new IllegalArgumentException("Lỗi : Sách Không Tồn Tại");
        }

        int brrowedCount = 0;
        for(Loan l : loans){
            if(l.getIsbn() != null && l.getIsbn().equals(isbn)){
                brrowedCount++;
            }
        }

        int available = book.getAvailableCopises() - brrowedCount;

      return Math.max(0, available);
    }
}


