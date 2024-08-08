package Customer;

public class ContactDetails implements IContactDetails{
    private final String memberName;
    private final String memberMobileNo;

    public ContactDetails(String memberName, String memberMobileNo){
        this.memberName = memberName;
        this.memberMobileNo = memberMobileNo;
    }

    public String getName(){
        return memberName;
    }
    public String getMobileNo(){
        return memberMobileNo;
    }

    public String toString(){
        return "\n Name: " + memberName + '\n' +
                "Mobile No: " + memberMobileNo + '\n';
    }
}
