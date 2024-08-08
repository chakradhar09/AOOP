package Customer;

import Book.*;

import java.util.List;

public abstract class Membership implements IMembership {
    protected String memberShipId;
    protected IContactDetails contactDetails;
    protected List<IBook> memberBooks;
    protected String membershipType;

    public String getMemberShipId(){
        return memberShipId;
    }
    public List<IBook> getMemberBooks(){
        return memberBooks;
    }
    public String getMembershipType(){
        return membershipType;
    }
    public void lendBook(IBook book){
        memberBooks.add(book);
    }
    public void returnBook(IBook book){
        memberBooks.remove(book);
    }

    public String toString(){
        return "\nMemberShip Id: " + memberShipId + '\n' +
                "Name: " + contactDetails.getName() + '\n' +
                "Mobile No: " + contactDetails.getMobileNo() + '\n' +
                "MemberShip Type: " + membershipType + '\n';
    }
}
