package Customer;

import java.util.ArrayList;

public class StudentMemberShip extends Membership{

    public StudentMemberShip(String membershipId, IContactDetails contactDetails){
        this.memberShipId = membershipId;
        this.contactDetails = contactDetails;
        this.memberBooks = new ArrayList<>();
        this.membershipType = "Student";
    }
}
