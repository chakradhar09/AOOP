package Customer;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MemberShipManager {
    private final List<IMembership> memberships = new ArrayList<>();

    public void addMemberShip(IMembership membership){
        memberships.add(membership);
        System.out.println("Membership created successfully");
    }
    public IMembership getMemberShip(String memberShipId){
        for(IMembership i:  memberships){
            if(Objects.equals(memberShipId, i.getMemberShipId()))
                return i;
        }
        return null;
    }
    public boolean isMember(String memberShipId){
        for(IMembership i: memberships){
            if(Objects.equals(memberShipId, i.getMemberShipId()))
                return true;
        }
        return false;
    }
    public void cancelMemberShip(String memberShipId){
        if(isMember(memberShipId)) {
            System.out.println("Membership Canceled");
            memberships.remove(getMemberShip(memberShipId));
        }
        else
            System.out.println("Membership Id not found");
    }
    public void showMembershipDetails(String memberShipId){
        if(isMember(memberShipId))
            System.out.println(getMemberShip(memberShipId));
        else
            System.out.println("Membership Id not found");
    }
}
