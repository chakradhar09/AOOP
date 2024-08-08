package Book;

public abstract class Book implements IBook {
    protected String bookTitle;
    protected String bookISBN;
    protected String bookAuthor;
    protected String bookGenre;
    protected int bookCount;
    protected boolean bookAvailability;

    public String getBookTitle(){
        return bookTitle;
    }
    public String getBookAuthor(){
        return bookAuthor;
    }
    public String getBookISBN(){
        return bookISBN;
    }
    public String getBookGenre(){
        return bookGenre;
    }
    public boolean getBookAvailability(){
        return bookAvailability;
    }
    public int getBookCount(){
        return bookCount;
    }
    public void setBookCount(int bookCount){
        this.bookCount = bookCount;
    }

    public String toString() {
        return "\nBook ISBN: " + bookISBN + '\n' +
                "Book Title: " + bookTitle + '\n' +
                "Book Author: " + bookAuthor + '\n' +
                "Book Availability: " + (bookAvailability ? "Available" : "Not Available") + '\n';
    }
}
