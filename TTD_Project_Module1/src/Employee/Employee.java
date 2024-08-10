package Employee;

public abstract class Employee implements IEmployee {
    protected String employeeName;
    protected String employeeId;
    protected String employeeRole;
    protected String employeeSalary;

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
        return employeeSalary;
    }

    public void setEmployeeRole(String employeeRole){
        this.employeeRole = employeeRole;
    }
    public void setEmployeeSalary(String employeeSalary){
        this.employeeSalary = employeeSalary;
    }

    public String toString(){
        return "\nEmployee Id: " + employeeId + '\n' +
                "Employee Name: " + employeeName + '\n' +
                "Employee Role: " + employeeRole + '\n' +
                "Employee Salary: " + employeeSalary + '\n';
    }
}
