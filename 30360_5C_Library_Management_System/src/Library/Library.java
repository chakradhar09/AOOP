package Library;


import Book.*;
import Customer.*;

public class Library implements ILibrary{
    private final static MemberShipManager memberShipManager = new MemberShipManager();
    private final static BookManager bookManager = new BookManager();

    public void lendBook(String memberShipId, String bookISBN){
        if(memberShipManager.isMember(memberShipId)){
            if(bookManager.isBook(bookISBN)) {
                if(bookManager.getBook(bookISBN).getBookAvailability()) {
                    memberShipManager.getMemberShip(memberShipId).getMemberBooks().add(bookManager.getBook(bookISBN));
                    System.out.println("Book has been lent");
                    bookManager.getBook(bookISBN).setBookCount(bookManager.getBook(bookISBN).getBookCount() - 1);
                }
                else
                    System.out.println("Book not available");
            }
            else
                System.out.println("Book not found");
        }
        else
            System.out.println("Membership Id not found");
    }
    public void receiveBook(String memberShipId, String bookISBN){
        if(memberShipManager.isMember(memberShipId)){
            if(bookManager.isBook(bookISBN)) {
                memberShipManager.getMemberShip(memberShipId).getMemberBooks().add(bookManager.getBook(bookISBN));
                bookManager.getBook(bookISBN).setBookCount(bookManager.getBook(bookISBN).getBookCount() + 1);
                System.out.println("Book received");
            }
            else
                System.out.println("Book not found");
        }
        else
            System.out.println("Membership Id not found");
    }
}
