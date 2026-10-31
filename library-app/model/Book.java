package model;

public class Book {
    private final String isbn;
    private final String tilte;
    private final String author;
    private final String year;
    private genre genre;
    private final int totalCopies;
    private int availableCopises;

    // Constructor
    public Book(String isbn, String tilte, String author, String year, genre genre, int totalCopies){
        if(isbn == null || isbn.isEmpty() || isbn.isBlank()){
            throw new IllegalArgumentException("Lỗi : ID Sách Không Hợp Lệ");
        }
        if(tilte == null || tilte.isEmpty() || tilte.isBlank()){
            throw new IllegalArgumentException("Lỗi : Tilte Không Hợp Lệ");
        }
        if(author == null || author.isEmpty() || author.isBlank()){
            throw new IllegalArgumentException("Lỗi : Author Không Hợp Lệ");
        }
        if(year == null || year.isEmpty() || year.isBlank()){
            throw new IllegalArgumentException("Lỗi : Year Không Hợp Lệ");
        }
        if(genre == null){
            throw new IllegalArgumentException("Lỗi : Thể Loại Sách Không Xác Định");
        }
        if(totalCopies < 1){
            throw new IllegalArgumentException("Lỗi : Phải ít nhất có 1 bản sao");
        }

        this.isbn = isbn;
        this.tilte = tilte;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.totalCopies = totalCopies;
        this.availableCopises = totalCopies;
    }

    // Get
    public String getIsbn(){
        return  isbn;
    }
    public String getTitle(){
        return  tilte;
    }
    public String getAuthor(){
        return author;
    }
    public String getYear(){
        return year;
    }
    public int getTotalCopies(){
        return totalCopies;
    }
    public int getAvailableCopises(){
        return availableCopises;
    }

    public String getGenre(){
        return genre.getDisplayName();
    }

    // Set
    public void setAvailableCopises(int newAvailableCopieses){
        this.availableCopises = newAvailableCopieses;
    }

    public boolean hasAvailableCopy() {
        return availableCopises > 0;
    }

    public void takeCopy(){
        if(!hasAvailableCopy()){
            throw new IllegalStateException("Sách " + this.isbn + " Đã Hết Bản Sao.");
        }
        availableCopises--;
    }

    public void returnCopy(){
        if(availableCopises >= totalCopies){
            throw new IllegalStateException("Sách " + this.isbn + " Đã Đủ Bản Sao");
        }
        availableCopises++;
    }

}
