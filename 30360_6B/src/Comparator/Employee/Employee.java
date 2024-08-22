package Comparator.Employee;


public class Employee{
    private final String empId;
    private final String empName;

    public Employee(String empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }

    public String getEmpName(){
        return empName;
    }

    public String toString(){
        return "\nEmployee Id: " + empId + '\n' +
                "Employee Name: " + empName;
    }
}
