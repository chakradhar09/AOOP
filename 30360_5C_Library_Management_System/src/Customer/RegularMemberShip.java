package Customer;

public class RegularMemberShip extends Membership{

    public RegularMemberShip(String memberShipId, IContactDetails contactDetails){
        this.memberShipId = memberShipId;
        this.contactDetails = contactDetails;
        this.membershipType = "Regular";
    }
}
