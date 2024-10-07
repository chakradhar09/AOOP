import StudentDataBaseManager.StudentDataBaseManager;

import java.util.Scanner;

public class StudentInformationSystem {
    static StudentDataBaseManager studentDataBaseManager;
    static void menu(){
        System.out.println("|                   Menu                |");
        System.out.println("Add Student Record (add)");
        System.out.println("Update Student name (update)");
        System.out.println("Delete Student Record (delete)");
        System.out.println("Display Student Records (display)");
        System.out.println("Exit (exit)");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String command, url, user, password, name, program, branch, attribute, updatedValue;
        int id;

        do{
            System.out.print("PostgreSQL DataBase URL: ");
            url = input.next();
            System.out.print("User: ");
            user = input.next();
            System.out.print("Password: ");
            password = input.next();

            studentDataBaseManager = new StudentDataBaseManager(url, user, password);

            menu();

            do{
                System.out.print(":> ");
                command  = input.next();

                if(command.equalsIgnoreCase("menu"))
                    menu();
                else if(command.equalsIgnoreCase("add")){
                    System.out.print("Student ID: ");
                    id = input.nextInt();

                    input.nextLine();

                    System.out.print("Name: ");
                    name = input.nextLine();
                    System.out.print("Program: ");
                    program = input.nextLine();

                    System.out.print("Branch: ");
                    branch = input.nextLine();

                    studentDataBaseManager.insertStudentRecord(id, name, program, branch);
                }
                else if(command.equalsIgnoreCase("update")){
                    System.out.print("Student ID: ");
                    id = input.nextInt();

                    input.nextLine();

                    System.out.print("Update Value: ");
                    updatedValue = input.nextLine();

                    studentDataBaseManager.updateStudentRecord(id, updatedValue);
                }
                else if (command.equalsIgnoreCase("delete")){
                    System.out.print("Student ID: ");
                    id = input.nextInt();

                    studentDataBaseManager.deleteStudentRecord(id);
                }
                else if(command.equalsIgnoreCase("display"))
                    studentDataBaseManager.displayStudentRecords();
                else if(command.equalsIgnoreCase("exit")){
                    studentDataBaseManager.endConnection();
                    System.out.println("Exiting...");
                }
                else
                    System.out.println("Invalid command");
            }while(!command.equalsIgnoreCase("exit") && studentDataBaseManager.checkConnection());
        }while(!studentDataBaseManager.checkConnection());
    }
}
