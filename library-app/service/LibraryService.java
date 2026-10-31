package service;

import model.Book;
import model.Loan;
import model.Member;
import notifier.Notifier;


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
            throw new IllegalArgumentException("Book Không Hợp Lệ");
        }
        for(Book b : books){
            if(b.getIsbn().equalsIgnoreCase(book.getIsbn())){
                throw new IllegalArgumentException("Sách [ " + book.getTitle() + " ] Trùng Không Thể Thêm");
            }
        }
        books.add(book);
    }

    public void addMember(Member member){
        if(member == null){
            throw new IllegalArgumentException("Member Không Hợp Lệ ");
        }
        for(Member m : members){
            if(m.getId().equalsIgnoreCase(member.getId())){
                throw new IllegalArgumentException("Đã Có [ " + member.getId() + "] Là Thành Viên");
            }
        }
        members.add(member);
    }

    private Member findMember(String idMember){
        for(Member m : members){
            if(m.getId().equalsIgnoreCase(idMember)){
                return m;
            }
        }
        throw new IllegalArgumentException("Không Có Bạn Đọc " + idMember);
    }

    private Book findBook(String isbn){
        for(Book b : books){
            if(b.getIsbn().equalsIgnoreCase(isbn)){
                return b;
            }
        }
        throw new IllegalArgumentException("Không Có " +isbn+ " Book ");
    }

    private Loan findActiveLoan(String memberId, String isbn){
        for(Loan l : loans){
            if(l.getMemberId().equalsIgnoreCase(memberId) && l.getIsbn().equalsIgnoreCase(isbn)){
                return l;
            }
        }
        return null;
    }

    public int activeLoanCount(String memberID){
        int count = 0;
       for(Loan l : loans){
               if (l.getMemberId().equalsIgnoreCase(memberID)) {
                   count++;
               }
       }
       return count;
    }


    public Loan borrow(String memberId, String isbn){
        Member member = findMember(memberId);
        Book book  = findBook(isbn);

        if(!book.hasAvailableCopy()){
            throw new IllegalArgumentException("Sách Đã Hết Bản Sao : " + isbn);
        }
        if(activeLoanCount(memberId) >= member.maxBook()){
            throw new IllegalArgumentException(member.getName() + " đã mượn tối đa " + member.maxBook() + " cuốn");
        }

        book.takeCopy();
        Loan loan = new Loan(member.getId(), book.getIsbn(), LocalDate.now());
        loans.add(loan);
        notifier.send(member.getName(), " Bạn Đã Mượn " +book.getTitle()+ ", [Hạn Trả] : " + loan.dueDate());
        return loan;
    }

    public long giveBack(String memberId, String isbn, LocalDate returnedOn){
        Member member = findMember(memberId);
        Book book = findBook(isbn);
        Loan loan = findActiveLoan(memberId, isbn);
        if(loan == null){
            throw new IllegalArgumentException("Không Tìm Lịch Sử Mượn Của Thành Viên " + member.getName());
        }

        long lateDays = loan.lateDays(returnedOn);
        long fee = member.calculateLateFee((int) lateDays);

        book.returnCopy();
        loans.remove(loan);
        notifier.send(member.getName(), "Đã Trả " +book.getTitle());
        return fee;
    }

    public List<Book> search(String keyword){
        if(keyword == null || keyword.trim().isEmpty()){
            return new ArrayList<>();
        }
        String lowerkeyword = keyword.toLowerCase(Locale.ROOT);
        List<Book> result = new ArrayList<>();
        for(Book b : books){
            if(b.getTitle() != null && b.getTitle().toLowerCase(Locale.ROOT).contains(lowerkeyword)){
                result.add(b);
            }
        }
        return result;
    }

    public int availableCopies(String isbn){
        if(isbn == null || isbn.trim().isEmpty()){
            throw new IllegalArgumentException("ID Book Tìm Kiếm Không Hợp Lệ");
        }
        Book book = null;

        for(Book b : books){
            if(b.getIsbn().toLowerCase(Locale.ROOT).equalsIgnoreCase(isbn.toLowerCase(Locale.ROOT))){
                book = b;
                break;
            }
        }
        if(book == null){
            throw new IllegalArgumentException("Sách Không Tồn Tại");
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


