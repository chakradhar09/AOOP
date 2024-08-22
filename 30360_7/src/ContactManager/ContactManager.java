package ContactManager;

import java.util.*;

public class ContactManager {
    private final Set<Contact> contacts;

    public ContactManager(){
        this.contacts = new TreeSet<>();
    }

    public boolean exitsPhoneNumber(String phoneNumber){
        for(Contact contact: contacts){
            if(Objects.equals(phoneNumber, contact.getPhoneNumber()))
                return true;
        }
        return false;
    }
    public boolean isEmpty(){
        return !contacts.isEmpty();
    }
    public Contact getContact(String phoneNumber){
        for(Contact contact: contacts){
            if(Objects.equals(phoneNumber, contact.getPhoneNumber()))
                return contact;
        }
        return null;
    }

    public boolean addContact(Contact contact){
        return contacts.add(contact);
    }
    public boolean removeContact(String phoneNumber){
        return contacts.remove(getContact(phoneNumber));
    }
    public void displayAllContacts(){
        for(Contact contact: contacts)
            System.out.println(contact);
    }
}
