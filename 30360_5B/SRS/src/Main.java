import Employee.CEO;
import Employee.IEmployee;
import Salary.ISalary;
import Salary.Salary;

public class Main {
    public static void main(String[] args) {
        ISalary joeSalary = new Salary(25000.0);
        IEmployee joe = new CEO("154412", "Joe", joeSalary);

        System.out.println(joe.getEmployeeId());
        System.out.println(joe.getEmployeeName());
        System.out.println(joe.getEmployeeRole());
        System.out.println(joe.getEmployeeSalary());
    }
}