package Employee;

import Salary.ISalary;

public class GM extends Employee{

    public GM(String employeeId, String employeeName, ISalary salary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeRole = "GM";
        this.employeeSalary = salary;
    }
}
