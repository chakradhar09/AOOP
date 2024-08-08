package Book;

public interface IBook {
    public String getBookTitle();
    public String getBookAuthor();
    public String getBookISBN();
    public String getBookGenre();
    public int getBookCount();
    public boolean getBookAvailability();
    public void setBookCount(int bookCount);
}
