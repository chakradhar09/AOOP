import Book.*;
import Customer.*;
import Library.*;

import java.util.Scanner;

public class Main {
    static MemberShipManager memberShipManager = new MemberShipManager();
    static BookManager bookManager = new BookManager();

    static void menu(){
        System.out.println("1.New Membership");
        System.out.println("2.Show Membership Details");
        System.out.println("3.Lend Book");
        System.out.println("4.Receive Book");
        System.out.println("5.Add New Book");
        System.out.println("6.Search Book");
        System.out.println("7.Remove Book");
        System.out.println("8.Cancel Membership");
        System.out.println("0.Exit");
        System.out.print("Chose from the given option: ");
    }
    public static void genre(){
        System.out.println("Books Genre");
        System.out.println("1.Fantasy");
        System.out.println("2.Sci-fi");
        System.out.println("3.Academic");
        System.out.print("Chose from the given option: ");
    }
    public static void memberShipType(){
        System.out.println("Membership Types");
        System.out.println("1.Regular");
        System.out.println("2.Student");
        System.out.print("Chose form the given option: ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ILibrary library = new Library();
        IMembership membership = null;
        IBook book;

        int choice;
        String memberShipId;
        String bookISBN;
        do{
            menu();
            choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Membership Id: ");
                    memberShipId = input.next();
                    input.nextLine();
                    System.out.print("Name: ");
                    String name = input.nextLine();
                    System.out.print("Mobile No: ");
                    String mobileNo = input.next();
                    ContactDetails contactDetails = new ContactDetails(name, mobileNo);

                    do {
                        memberShipType();
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                membership = new RegularMemberShip(memberShipId, contactDetails);
                                break;
                            case 2:
                                membership = new StudentMemberShip(memberShipId, contactDetails);
                                break;
                            default:
                                System.out.println("Invalid membership Type");
                        }
                    }while(choice != 1 && choice != 2);
                    memberShipManager.addMemberShip(membership);
                    break;
                case 2:
                    System.out.print("Membership Id: ");
                    memberShipId= input.next();
                    memberShipManager.showMembershipDetails(memberShipId);
                    break;
                case 3:
                    System.out.print("Book ISBN No: ");
                    bookISBN = input.next();
                    System.out.print("Membership Id: ");
                    memberShipId = input.next();
                    library.lendBook(memberShipId, bookISBN);
                    break;
                case 4:
                    System.out.print("Book ISBN No: ");
                    bookISBN = input.next();
                    System.out.print("Membership Id: ");
                    memberShipId = input.next();
                    library.receiveBook(memberShipId, bookISBN);
                    break;
                case 5:
                    System.out.print("Book ISBN No: ");
                    bookISBN = input.next();
                    System.out.print("Book Title: ");
                    input.nextLine();
                    String bookName = input.nextLine();
                    System.out.print("Book Author: ");
                    String bookAuthor = input.nextLine();
                    System.out.print("No:of Books: ");
                    int noOfBooks = input.nextInt();
                    do{
                        genre();
                        choice = input.nextInt();
                        switch (choice){
                            case 1:
                                book = new Fantasy(bookISBN, bookName, bookAuthor, noOfBooks);
                                bookManager.addBooks(book);
                                break;
                            case 2:
                                book = new Scifi(bookISBN, bookName, bookAuthor, noOfBooks);
                                bookManager.addBooks(book);
                                break;
                            case 3:
                                book = new Academic(bookISBN, bookName, bookAuthor, noOfBooks);
                                bookManager.addBooks(book);
                                break;
                            default:
                                System.out.println("Invalid Genre");
                        }
                    }while(choice !=1 && choice != 2 && choice != 3);
                    break;
                case 6:
                    System.out.print("Book ISBN No: ");
                    bookISBN = input.next();
                    bookManager.searchBook(bookISBN);
                    break;
                case 7:
                    System.out.print("Book ISBN No: ");
                    bookISBN = input.next();
                    bookManager.removeBooks(bookISBN);
                    break;
                case 8:
                    System.out.print("Membership Id: ");
                    memberShipId = input.next();
                    memberShipManager.cancelMemberShip(memberShipId);
                    break;
                case 0:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }while(choice != 0);
        input.close();
    }
}