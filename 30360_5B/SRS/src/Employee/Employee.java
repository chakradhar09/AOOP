package Employee;

import Salary.ISalary;

public abstract class Employee implements IEmployee {
    protected String employeeName;
    protected String employeeId;
    protected ISalary employeeSalary;
    protected String employeeRole;

    public String getEmployeeName(){
        return employeeName;
    }
    public String getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeRole(){
        return employeeRole;
    }
    public String getEmployeeSalary(){
        return employeeSalary.formatSalary();
    }
}
