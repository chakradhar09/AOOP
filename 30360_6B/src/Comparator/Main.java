package Comparator;

import Comparator.Employee.Employee;

import java.util.*;

public class Main {
    static List<Employee> employees = new ArrayList<>();

    static Comparator<Employee> nameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return  o1.getEmpName().compareTo(o2.getEmpName());
        }
    };

    static void menu(){
        System.out.println("|               Menu                |");
        System.out.println("Add Employee (add)");
        System.out.println("Display Employees (display)");
        System.out.println("Exit (exit)");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee;

        String command, empId, empName;

        menu();

        do{
            System.out.print(">: ");
            command = input.next();

            if(command.equalsIgnoreCase("menu"))
                menu();
            else if(command.equalsIgnoreCase("add")){
                System.out.print("Employee Id: ");
                empId = input.next();
                System.out.print("Employee Name: ");
                input.nextLine();
                empName = input.nextLine();
                employee = new Employee(empId, empName);
            }
            else if(command.equalsIgnoreCase("display")){
                employees.sort(nameComparator);
                for(Employee emp: employees)
                    System.out.println(emp);
            }
            else if(command.equalsIgnoreCase("exit"))
                System.out.println("Exiting...");
            else
                System.out.println("Invalid Operation");
        }while(!command.equalsIgnoreCase("exit"));
    }
}
