package Book;

public class Fantasy extends Book{

    public Fantasy(String bookISBN, String bookTitle, String bookAuthor, int noOfBooks){
        this.bookISBN = bookISBN;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookGenre = "Fantasy";
        this.bookCount = noOfBooks;
        this.bookAvailability = noOfBooks != 0;
    }
}
