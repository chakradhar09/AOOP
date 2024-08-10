package Employee;

public class CEO extends Employee{

    public CEO(String employeeId, String employeeName, String employeeSalary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeRole = "CEO";
        this.employeeSalary = employeeSalary;
    }
}
