import Employee.*;

import java.util.Scanner;

public class Main {
    static EmployeeManager employeeManager = new EmployeeManager();

    public static void employeeManagementMenu(){
        System.out.println("|       Management Menu (menu)      |");
        System.out.println("Recruit Employee (recruit)");
        System.out.println("Show Employee Details (show)");
        System.out.println("Fetch Employee (fetch)");
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
    }
    public static void fetchEmployee(){
        System.out.println("|       Fetch Employee      |");
        System.out.println("Name (employeename)");
        System.out.println("Role (employeerole)");
        System.out.println("Salary (employeesalary)");
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

        employeeManagementMenu();//Setting Up Employee Management Menu
        do{
            System.out.print("Enter Command: ");
            command = input.next();
            if(command.equalsIgnoreCase("menu"))
                employeeManagementMenu();//Display Employee Management Menu
            else if(command.equalsIgnoreCase("recruit")){
                System.out.print("Employee Id: ");
                employeeId = input.next();
                System.out.print("Employee Name: ");
                input.nextLine();
                String employeeName = input.nextLine();
                System.out.print("Employee Salary: ");
                employeeSalary = input.next();
                recruitment();//Displaying Available Employee Role
                do{
                    System.out.print("Select Employee Role: ");
                    command = input.next();
                    if (command.equalsIgnoreCase("ceo")) {
                        employee = new CEO(employeeId, employeeName, employeeManager.formatSalary(employeeSalary));
                        recruit(employee);
                        break;
                    }
                    else if (command.equalsIgnoreCase("gm")) {
                        employee = new GM(employeeId, employeeName, employeeManager.formatSalary(employeeSalary));
                        recruit(employee);
                        break;
                    }
                    else if (command.equalsIgnoreCase("agm")) {
                        employee = new AGM(employeeId, employeeName, employeeManager.formatSalary(employeeSalary));
                        recruit(employee);
                        break;
                    }
                    else if(command.equalsIgnoreCase("back"))
                        System.out.println("Safe exiting recruit");
                    else
                        System.out.println("Invalid Employee Role");
                }while(!command.equalsIgnoreCase("back"));//Exiting the loop with the use "back" command
            }
            else if(command.equalsIgnoreCase("show")){
                System.out.print("Employee Id: ");
                employeeId = input.next();
                if(employeeManager.isEmployee(employeeId))
                    System.out.println(employeeManager.getEmployee(employeeId));
                else
                    System.out.println("Invalid Employee Id");
            }
            else if(command.equalsIgnoreCase("fetch")){
                System.out.print("Employee Id: ");
                employeeId = input.next();
                if(employeeManager.isEmployee(employeeId)){
                    fetchEmployee();
                    do {
                        System.out.print("Fetch Employee: ");
                        command = input.next();
                        if (command.equalsIgnoreCase("employeename")) {
                            System.out.println("Employee Name: " + employeeManager.getEmployee(employeeId).getEmployeeName());
                            break;
                        }
                        else if (command.equalsIgnoreCase("employeerole")) {
                            System.out.println("Employee Role: " + employeeManager.getEmployee(employeeId).getEmployeeRole());
                            break;
                        }
                        else if (command.equalsIgnoreCase("employeesalary")) {
                            System.out.println("Employee Salary" + employeeManager.getEmployee(employeeId).getEmployeeSalary());
                            break;
                        }
                        else if(command.equalsIgnoreCase("back"))
                            System.out.println("Safe exiting fetch");
                        else
                            System.out.println("Invalid Fetch");
                    }while(!command.equalsIgnoreCase("back"));//Exiting the loop with the use of "back" command
                }
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
                System.out.println("Exiting..");
            else
                System.out.println("Invalid Command");
        }while(!command.equalsIgnoreCase("exit"));
    }
}
