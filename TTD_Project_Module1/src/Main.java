import Employee.*;

import java.util.Scanner;

public class Main {
    static EmployeeManager employeeManager = new EmployeeManager();

    public static void employeeManagementMenu(){
        System.out.println("|       Management Menu (menu)      |");
        System.out.println("Recruit Employee (recruit)");
        System.out.println("Show Employee Details (show)");
        System.out.println("Fire Employee (fire)");
        System.out.println("List Out Employees (list)");
        System.out.println("Promote/Demote Employee (role)");
        System.out.println("Update Employee Salary (salary)");
        System.out.println("Exit (exit)");
    }
    public static void recruitment(){
        System.out.println("|       Employee Role       |");
        System.out.println("Chief Executive Officer (ceo)");
        System.out.println("General Manager (gm)");
        System.out.println("Assistant General Manager (agm)");
        System.out.print("Select Employee Role: ");
    }
    public static void recruit(IEmployee employee){
        if(employeeManager.recruitEmployee(employee))
            System.out.println("Employee Recruited");
        else
            System.out.println("Employee Recruitment Failed");
    }
    public static void updateRole(String employeeId, String updatedEmployeeRole){
        if(employeeManager.updateEmployeeRole(employeeId, updatedEmployeeRole))
            System.out.println("Employee Role Updated");
        else
            System.out.println("Failed To Update Employee Role");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IEmployee employee;

        String employeeId;
        String employeeSalary;
        String command;

        employeeManagementMenu();
        do{
            System.out.print("Enter Command: ");
            command = input.next();
            if(command.equalsIgnoreCase("menu"))
                employeeManagementMenu();
            else if(command.equalsIgnoreCase("recruit")){
                System.out.print("Employee Id: ");
                employeeId = input.next();
                System.out.print("Employee Name: ");
                input.nextLine();
                String employeeName = input.nextLine();
                System.out.print("Employee Salary: ");
                employeeSalary = input.next();
                recruitment();
                command = input.next();
                if(command.equalsIgnoreCase("ceo")){
                    employee = new CEO(employeeId, employeeName, employeeManager.formatSalary(employeeSalary));
                    recruit(employee);
                }
                else if(command.equalsIgnoreCase("gm")){
                    employee = new GM(employeeId, employeeName, employeeManager.formatSalary(employeeSalary));
                    recruit(employee);
                }
                else if(command.equalsIgnoreCase("agm")){
                    employee = new AGM(employeeId, employeeName, employeeManager.formatSalary(employeeSalary));
                    recruit(employee);
                }
                else
                    System.out.println("Invalid Employee Role");
            }
            else if(command.equalsIgnoreCase("show")){
                System.out.print("Employee Id: ");
                employeeId = input.next();
                if(employeeManager.isEmployee(employeeId))
                    System.out.println(employeeManager.getEmployee(employeeId));
                else
                    System.out.println("Invalid Employee Id");
            }
            else if(command.equalsIgnoreCase("fire")){
                System.out.print("Employee Id: ");
                employeeId = input.next();
                if(employeeManager.isEmployee(employeeId)){
                    if(employeeManager.fireEmployee(employeeId))
                        System.out.println("Employee fired");
                    else
                        System.out.println("Failed to fire Employee");
                }
                else
                    System.out.println("Invalid Employee Id");
            }
            else if(command.equalsIgnoreCase("list"))
                employeeManager.listAllEmployees();
            else if(command.equalsIgnoreCase("role")){
                System.out.print("Employee Id: ");
                employeeId = input.next();
                if(employeeManager.isEmployee(employeeId)){
                    recruitment();
                    command = input.next();
                    if(command.equalsIgnoreCase("ceo"))
                        updateRole(employeeId, command.toUpperCase());
                    else if(command.equalsIgnoreCase("gm"))
                        updateRole(employeeId, command.toUpperCase());
                    else if(command.equalsIgnoreCase("agm"))
                        updateRole(employeeId, command.toUpperCase());
                    else
                        System.out.println("Invalid Employee Role");
                }
                else
                    System.out.println("Invalid Employee Id");
            }
            else if(command.equalsIgnoreCase("salary")){
                System.out.print("Employee Id: ");
                employeeId = input.next();
                System.out.print("Updated Employee Salary: ");
                employeeSalary = input.next();
                if(employeeManager.isEmployee(employeeId)){
                    if(employeeManager.updateEmployeeSalary(employeeId, employeeSalary))
                        System.out.println("Employee Salary has been Updated");
                    else
                        System.out.println("Failed to Update Employee Salary");
                }
                else
                    System.out.println("Invalid Employee Id");
            }
            else if(command.equalsIgnoreCase("exit"))
                System.out.println("Exiting...");
            else
                System.out.println("Invalid Command");
        }while(!command.equalsIgnoreCase("exit"));
    }
}
