import BrowsingHistory.BrowsingHistory;

import java.util.Objects;
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
                System.out.println("Current New Page: " + browsingHistory.addNewPage(page));
            }
            else if(command.equalsIgnoreCase("previous")){
                if (browsingHistory.isPreviousEmpty()) {
                    browsingHistory.previousPage();
                    if(Objects.nonNull(browsingHistory.currentPage()))
                        System.out.println("Current: " + browsingHistory.currentPage());
                    else {
                        browsingHistory.nextPage();
                        System.out.println("This is the last page");
                    }
                }
                else
                    System.out.println("This is the last page");

            }
            else if(command.equalsIgnoreCase("next")){
                if (browsingHistory.isNextEmpty()) {
                    browsingHistory.nextPage();
                    if(Objects.nonNull(browsingHistory.currentPage()))
                        System.out.println("Current: " + browsingHistory.currentPage());
                    else {
                        browsingHistory.previousPage();
                        System.out.println("This is the first page");
                    }
                }
                else
                    System.out.println("This is the first page");

            }
            else if(command.equalsIgnoreCase("current")){
                if(browsingHistory.isPreviousEmpty())
                    System.out.println("Current: " + browsingHistory.currentPage());
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
