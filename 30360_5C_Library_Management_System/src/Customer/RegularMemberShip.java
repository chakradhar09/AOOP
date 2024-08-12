package Customer;

import java.util.ArrayList;

public class RegularMemberShip extends Membership{

    public RegularMemberShip(String memberShipId, IContactDetails contactDetails){
        this.memberShipId = memberShipId;
        this.contactDetails = contactDetails;
        this.memberBooks = new ArrayList<>();
        this.membershipType = "Regular";
    }
}
