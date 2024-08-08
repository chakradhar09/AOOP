package Book;

public class Scifi extends Book{

    public Scifi(String bookISBN, String bookTitle, String bookAuthor, int noOfBooks){
        this.bookTitle = bookTitle;
        this.bookISBN = bookISBN;
        this.bookAuthor = bookAuthor;
        this.bookGenre = "Sci-fi";
        this.bookCount = noOfBooks;
        this.bookAvailability = noOfBooks != 0;
    }
}
