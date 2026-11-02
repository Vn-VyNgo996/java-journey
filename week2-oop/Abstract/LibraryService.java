package Abstract;

public class LibraryService {
    private final Notifier notifier;

    public LibraryService(Notifier notifier){
        this.notifier = notifier;
    }

    public void notifyMember(String memberName, String bookTile){
        String message = "Bạn Đã Mượn Thành Công Cuốn Sách : " +bookTile;
        notifier.send(memberName, message);
    }
}
