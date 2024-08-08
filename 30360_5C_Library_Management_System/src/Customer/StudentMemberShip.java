package Customer;

public class StudentMemberShip extends Membership{

    public StudentMemberShip(String membershipId, IContactDetails contactDetails){
        this.memberShipId = membershipId;
        this.contactDetails = contactDetails;
        this.membershipType = "Student";
    }
}
