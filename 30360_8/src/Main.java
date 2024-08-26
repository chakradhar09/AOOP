import Employee.EmployeeManager;

import java.util.Scanner;

public class Main {
    static EmployeeManager employeeManager = new EmployeeManager();

    static void menu(){
        System.out.println("|                   Menu                    |");
        System.out.println("Add Employee (add)");
        System.out.println("Filter Employees (filter)");
        System.out.println("Sorted Employees (sorted)");
        System.out.println("View Highest Paid Employee (high)");
        System.out.println("View Average Salary (avg)");
        System.out.println("View Employees (view)");
        System.out.println("Remove Employee (remove)");
        System.out.println("Exit (exit)");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeeManager.Employee employee;

        String command, employeeId, employeeName;
        double employeeSalary;

        menu();

        do{
            System.out.print(">: ");
            command = input.next();

            if(command.equalsIgnoreCase("menu"))
                menu();
            else if(command.equalsIgnoreCase("add")){
                System.out.print("Employee Id: ");
                employeeId = input.next();
                System.out.print("Employee Name: ");
                input.nextLine();
                employeeName = input.nextLine();
                System.out.print("Employee Salary: ");
                employeeSalary = input.nextDouble();
                if(!employeeManager.isEmployee(employeeId)){
                    employee = new EmployeeManager.Employee(employeeId, employeeName, employeeSalary);
                    if(employeeManager.addEmployee(employee))
                        System.out.println("Employee Added Successfully");
                    else
                        System.out.println("Failed To Add Employee");
                }
                else
                    System.out.println("Employee Id already Exits");
            }
            else if(command.equalsIgnoreCase("filter")){
                if(employeeManager.isEmpty())
                    employeeManager.displayFilteredEmployees();
                else
                    System.out.println("The DataBase is Empty");
            }
            else if(command.equalsIgnoreCase("sort")){
                if(employeeManager.isEmpty())
                    employeeManager.displaySortedEmployees();
                else
                    System.out.println("The DataBase is empty");
            }
            else if(command.equalsIgnoreCase("high")){
                if(employeeManager.isEmpty())
                    System.out.println(employeeManager.getHighestPaidEmployee());
                else
                    System.out.println("The DataBase is Empty");
            }
            else if(command.equalsIgnoreCase("avg")){
                if(employeeManager.isEmpty())
                    System.out.println(employeeManager.getAvgSalary());
                else
                    System.out.println("The DateBase is Empty");
            }
            else if(command.equalsIgnoreCase("view")){
                if(employeeManager.isEmpty())
                    employeeManager.viewEmployees();
                else
                    System.out.println("The DataBase id Empty");
            }
            else if(command.equalsIgnoreCase("remove")){
                if(employeeManager.isEmpty()){
                    System.out.print("Employee Id: ");
                    employeeId = input.next();
                    if(employeeManager.isEmployee(employeeId)){
                        if(employeeManager.removeEmployee(employeeId))
                            System.out.println("The Employee Removed Successfully");
                        else
                            System.out.println("Failed To Remove Employee");
                    }
                    else
                        System.out.println("Invalid Employee Id");
                }
                else
                    System.out.println("The DataBase is Empty");
            }
            else if(command.equalsIgnoreCase("exit"))
                System.out.println("Exiting...");
            else
                System.out.println("Invalid Operation");
        }while(!command.equalsIgnoreCase("exit"));
    }
}
