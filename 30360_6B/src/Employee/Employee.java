package Employee;

public class Employee implements Comparable<Employee>{
    private final int empId;
    private final String name;

    public Employee(int empID, String name){
        this.empId = empID;
        this.name = name;
    }

    public int getEmpId(){
        return empId;
    }
    public String getName(){
        return name;
    }

    public int compareTo(Employee employee){
        return Integer.compare(this.empId, employee.getEmpId());
    }
    public String toString(){
        return "\nEmployee Id: " + empId + '\n' +
                "Employee Name: " + name;
    }
}
