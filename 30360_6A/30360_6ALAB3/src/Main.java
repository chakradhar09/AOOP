import CustomerTicketSupportSystem.CustomerTicketSupportSystem;

import java.util.Scanner;

public class Main {
    static CustomerTicketSupportSystem customerTicketSupportSystem = new CustomerTicketSupportSystem();

    static void menu(){
        System.out.println("|           Menu        |");
        System.out.println("Add Ticket (add)");
        System.out.println("Process Ticket (process)");
        System.out.println("View the ticket to be processed (view)");
        System.out.println("View all pending tickets (pending)");
        System.out.println("Exit (exit)");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String command, ticketId;

        menu();

        do{
            System.out.print("> ");
            command = input.next();

            if(command.equalsIgnoreCase("menu"))
                menu();
            else if(command.equalsIgnoreCase("add")){
                System.out.print("Ticket ID: ");
                ticketId = input.next();
                if(!customerTicketSupportSystem.isTicket(ticketId)){
                    if(customerTicketSupportSystem.addTicket(ticketId))
                        System.out.println("Ticket Added Successfully");
                    else
                        System.out.println("Failed To Add Ticket");
                }
                else
                    System.out.println("Duplicate Ticket Entered");
            }
            else if(command.equalsIgnoreCase("process")){
                if(customerTicketSupportSystem.isEmpty())
                    System.out.println("Processed: " + customerTicketSupportSystem.processTicket());
                else
                    System.out.println("There are no pending Tickets");
            }
            else if(command.equalsIgnoreCase("view")){
                if(customerTicketSupportSystem.isEmpty())
                    System.out.println("Next Ticket to be processed: " + customerTicketSupportSystem.peek());
                else
                    System.out.println("There are no pending Tickets");
            }
            else if(command.equalsIgnoreCase("pending")){
                if(customerTicketSupportSystem.isEmpty())
                    System.out.println(customerTicketSupportSystem.list());
                else
                    System.out.println("There Are no pending Tickets");
            }
            else if(command.equalsIgnoreCase("exit"))
                System.out.println("Exiting...");
            else
                System.out.println("Invalid Operation");
        }while(!command.equalsIgnoreCase("exit"));
    }
}
