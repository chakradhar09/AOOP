import ContactManager.*;

import java.util.Scanner;

public class Main {
    static ContactManager contactManager = new ContactManager();

    static void menu(){
        System.out.println("|                   Menu                    |");
        System.out.println("Add Contact (add)");
        System.out.println("Remove Contact (remove)");
        System.out.println("View All Contacts (all)");
        System.out.println("Exit (exit)");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Contact contact;

        String command, name, email, phoneNumber;

        menu();

        do{
            System.out.print(">: ");
            command = input.next();

            if(command.equalsIgnoreCase("menu"))
                menu();
            else if(command.equalsIgnoreCase("add")){
                System.out.print("Name: ");
                input.nextLine();
                name = input.nextLine();
                System.out.print("Email: ");
                email = input.next();
                System.out.print("Phone Number: ");
                phoneNumber = input.next();

                if(!contactManager.exitsPhoneNumber(phoneNumber)){
                    contact = new Contact(name, email, phoneNumber);
                    if(contactManager.addContact(contact))
                        System.out.println("Contact Added to Contacts");
                    else
                        System.out.println("Failed to Add Contact to Contacts");
                }
                else
                    System.out.println(contactManager.getContact(phoneNumber));
            }
            else if(command.equalsIgnoreCase("remove")){
                if(contactManager.isEmpty()){
                    System.out.print("Phone Number: ");
                    phoneNumber = input.next();

                    if(contactManager.exitsPhoneNumber(phoneNumber)){
                        if(contactManager.removeContact(phoneNumber))
                            System.out.println("Contact Removed from the Contacts");
                        else
                            System.out.println("Failed to Remove Contact from Contacts");
                    }
                    else
                        System.out.println("Contact doesn't Exist");
                }
                else
                    System.out.println("There are no Contacts");
            }
            else if(command.equalsIgnoreCase("all")){
                if(contactManager.isEmpty())
                    contactManager.displayAllContacts();
                else
                    System.out.println("There are no Contacts");
            }
            else if(command.equalsIgnoreCase("exit"))
                System.out.println("Exiting...");
            else
                System.out.println("Invalid Operation");
        }while(!command.equalsIgnoreCase("exit"));
    }
}
