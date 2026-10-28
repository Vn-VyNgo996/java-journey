package Abstract;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo linh kiện cụ thể
        Notifier consoleNotifier = new ConsoloNotifier();

        // Tiêm linh kiện vào libraryService thông qua contructor
        LibraryService libraryService = new LibraryService(consoleNotifier);
        libraryService.notifyMember("Nguyễn Văn A", "Lập Trình Java");
    }
}
