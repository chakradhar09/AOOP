package Book;

public class Academic extends Book{

    public Academic(String bookISBN, String bookTitle, String bookAuthor, int noOfBooks){
        this.bookISBN = bookISBN;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookGenre = "Academic";
        this.bookCount = noOfBooks;
        this.bookAvailability = noOfBooks != 0;
    }
}
