import model.Book;
import model.StudentMemBer;
import model.genre;
import notifier.ConsoleNotifier;
import service.LibraryService;


public class Main {
    public static void main(String[] args) {
        LibraryService service = new LibraryService(new ConsoleNotifier());
        service.addBook(new Book("978-0134685991", "Effective Java", "Vỹ" ,"2018", genre.SCIENCE, 2));
        service.addMember(new StudentMemBer("S01", "An", "098765432"));

        service.borrow("S01", "978-0134685991");
        System.out.println(service.availableCopies("978-0134685991"));

    }
}
