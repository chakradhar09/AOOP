import BrowsingHistory.BrowsingHistory;

import java.util.Scanner;

public class Main {
    static  BrowsingHistory browsingHistory = new BrowsingHistory();

    static void menu(){
        System.out.println("|               Menu               |");
        System.out.println("Add page (add)");
        System.out.println("Goto Previous Page (previous)");
        System.out.println("Goto Next Page (next)");
        System.out.println("Current Page (current)");
        System.out.println("Exit (exit)");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String command, page;

        menu();

        do{
            System.out.print("> ");
            command = input.next();

            if(command.equalsIgnoreCase("menu"))
                menu();
            else if(command.equalsIgnoreCase("add")){
                System.out.print("URL: ");
                page = input.next();
                System.out.println(browsingHistory.addNewPage(page));
            }
            else if(command.equalsIgnoreCase("previous")){
                if(browsingHistory.isEmpty()){
                    if (browsingHistory.backwardHasNext())
                        System.out.println("Current: " + browsingHistory.previousPage());
                    else
                        System.out.println("This is the last page");
                }
                else
                    System.out.println("The Browsing History is Empty");
            }
            else if(command.equalsIgnoreCase("next")){
                if(browsingHistory.isEmpty()){
                    if (browsingHistory.forwardHasNext())
                        System.out.println("Current: " + browsingHistory.nextPage());
                    else
                        System.out.println("This is the first page");
                }
                else
                    System.out.println("The Browsing History is Empty");
            }
            else if(command.equalsIgnoreCase("current")){
                if(browsingHistory.isEmpty())
                    System.out.println(browsingHistory.currentPage());
                else
                    System.out.println("The Browsing History is Empty");
            }
            else if(command.equalsIgnoreCase("exit"))
                System.out.println("Exiting...");
            else
                System.out.println("Invalid Operation");
        }while(!command.equalsIgnoreCase("exit"));
    }
}
