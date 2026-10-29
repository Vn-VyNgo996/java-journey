package Enum;

public class Book {
    private String idBook;
    private String title;
    private String author;
    private Gener gener;


    // Constructor
    public Book(String idBook, String title, String author, Gener gener){
        this.idBook = idBook;
        this.title = title;
        this.author = author;
        this.gener = gener;
    }

    @Override
    public String  toString(){
        return String.format("Book [ISBN: %s | Tác phẩm: '%s' | Tác giả: %s | Thể loại: %s]",
                this.idBook, this.title, this.author, gener.getDisplayName());
    }
}
