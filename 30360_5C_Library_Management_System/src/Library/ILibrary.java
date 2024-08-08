package Library;

import Book.IBook;
import Customer.IMembership;

public interface ILibrary {
    public void lendBook(String memberShipId, String bookISBN);
    public void receiveBook(String memberShipId, String bookISBN);
}
