package Customer;

import Book.*;

import java.util.List;

public interface IMembership {
    public String getMemberShipId();
    public List<IBook> getMemberBooks();
    public String getMembershipType();
    public void lendBook(IBook book);
    public void returnBook(IBook book);
}
