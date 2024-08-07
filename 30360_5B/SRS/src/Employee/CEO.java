package Employee;

import Salary.ISalary;

public class CEO extends Employee{

    public CEO(String employeeId, String employeeName, ISalary salary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeRole = "CEO";
        this.employeeSalary = salary;
    }
}
