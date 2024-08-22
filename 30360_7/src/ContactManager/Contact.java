package ContactManager;

public class Contact implements Comparable<Contact>{
    private final String name;
    private final String email;
    private final String phoneNumber;

    public Contact(String name, String email, String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public int compareTo(Contact contact){
        return phoneNumber.compareTo(contact.getPhoneNumber());
    }
    public String toString(){
        return "\nName: " + name + '\n' +
                "Email: " + email + '\n' +
                "Phone Number: " + phoneNumber;
    }
}
