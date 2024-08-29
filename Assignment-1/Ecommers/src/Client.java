import Product.*;

import java.util.Scanner;

public class Client {
    static ProductManager productManager = new ProductManager();

    static void menu(){
        System.out.println("|               Menu                |");
        System.out.println("Add Product (add)");
        System.out.println("Remove Product (remove)");
        System.out.println("View Products (view)");
        System.out.println("Exit (exit)");
    }
    static void productMenu(){
        System.out.println("|               Product Manager             |");
        System.out.println("Concrete Product 1 (product1)");
        System.out.println("Concrete Product 2 (product2)");
        System.out.print("Select: ");
    }
    static void addProduct(IProduct product){
        if(productManager.addProduct(product))
            System.out.println("Product Added Successfully");
        else
            System.out.println("Failed To Add Product");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String command, productId, productName;

        menu();

        do{
            System.out.print(">: ");
            command = input.next();

            if(command.equalsIgnoreCase("add")){
                System.out.print("Product ID: ");
                productId = input.next();
                System.out.print("Product Name: ");
                input.nextLine();
                productName = input.nextLine();
                if(!productManager.isProduct(productId)){
                    productMenu();
                    command = input.next();
                    if(command.equalsIgnoreCase("product1"))
                        addProduct(new ConcreteProduct1(productId, productName));
                    else if(command.equalsIgnoreCase("product2"))
                        addProduct(new ConcreteProduct2(productId, productName));
                    else
                        System.out.println("Invalid Product Type");
                }
                else
                    System.out.println("Duplicate Product Id Entered");
            }
            else if(command.equalsIgnoreCase("remove")){
                if(productManager.isEmpty()){
                    System.out.print("Product ID: ");
                    productId = input.next();
                    if(productManager.isProduct(productId)){
                        if(productManager.removeProduct(productId))
                            System.out.println("Product Removed Successfully");
                        else
                            System.out.println("Failed To Remove Product");
                    }
                    else
                        System.out.println("Invalid Product Id Entered");
                }
                else
                    System.out.println("DataBase id Empty");
            }
            else if(command.equalsIgnoreCase("view")){
                if(productManager.isEmpty())
                    productManager.view();
                else
                    System.out.println("DataBase is Empty");
            }
            else if(command.equalsIgnoreCase("menu"))
                menu();
            else if(command.equalsIgnoreCase("exit"))
                System.out.println("Exiting...");
            else
                System.out.println("Invalid Operation");
        }while(!command.equalsIgnoreCase("exit"));
    }
}
