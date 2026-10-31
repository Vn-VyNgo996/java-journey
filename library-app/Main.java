import model.*;
import notifier.ConsoleNotifier;
import service.LibraryService;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        ConsoleNotifier notifier = new ConsoleNotifier();
        LibraryService service = new LibraryService(notifier);


        Member member1 = new StudentMemBer("MB1", "Văn", "0000");
        Member member2 = new VIPMember("MB2", "Lý", "9999");

        Book book1 = new Book("B001", "Tây Du Kí", "NO", "2018", genre.NOVEL, 2);
        Book book2 = new Book("B002", "Thần Bài", "Châu Tinh Trì", "2010", genre.NOVEL, 10);

        service.addMember(member1);
        service.addMember(member2);

        service.addBook(book1);
        service.addBook(book2);

        service.borrow("MB1", "B001");
        service.borrow("MB1", "B002");
        service.borrow("MB1", "B001");



    }
}
