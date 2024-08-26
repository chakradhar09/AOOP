package Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeManager{
    private final List<Employee> employeeManager;
    private List<Employee> employees;

    public static class Employee{
        private final String employeeId;
        private final String employeeName;
        private final double employeeSalary;

        public Employee(String employeeId, String employeeName, double employeeSalary){
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.employeeSalary = employeeSalary;
        }

        private String getEmployeeId(){
            return employeeId;
        }
        private double getEmployeeSalary(){
            return employeeSalary;
        }

        public String toString(){
            return "\nEmployee Id: " + employeeId + '\n' +
                    "Employee Name: " + employeeName + '\n' +
                    "Employee Salary: " + employeeSalary;
        }
    }

    public EmployeeManager(){
        this.employeeManager = new ArrayList<>();
    }

    public boolean isEmpty(){
        return !employeeManager.isEmpty();
    }
    public boolean isEmployee(String employeeId){
        for(Employee employee: employeeManager){
            if(Objects.equals(employeeId, employee.getEmployeeId()))
                return true;
        }
        return false;
    }
    public Employee getEmployee(String employeeId){
        for(Employee employee: employeeManager){
            if(Objects.equals(employeeId, employee.getEmployeeId()))
                return employee;
        }
        return null;
    }

    public boolean addEmployee(Employee employee){
        return employeeManager.add(employee);
    }
    public boolean removeEmployee(String employeeId){
        return employeeManager.remove(getEmployee(employeeId));
    }

    private void filterEmployees(){
        this.employees = employeeManager.stream().filter(e -> e.getEmployeeSalary() > getAvgSalary()).collect(Collectors.toList());
    }
    private void sortEmployees(){
        this.employees = employeeManager.stream().sorted(Comparator.comparingDouble(Employee::getEmployeeSalary)).collect(Collectors.toList());
    }

    public void displayFilteredEmployees(){
        filterEmployees();
        for(Employee employee: employees)
            System.out.println(employee);
    }
    public void displaySortedEmployees(){
        sortEmployees();
        for(Employee employee: employees)
            System.out.println(employee);
    }
    public double getAvgSalary(){
        return Math.abs(employeeManager.stream().mapToDouble(Employee::getEmployeeSalary).average().orElse(0.0));
    }
    public Employee getHighestPaidEmployee(){
        return employeeManager.stream().max(Comparator.comparingDouble(Employee::getEmployeeSalary)).orElse(null);
    }
    public void viewEmployees(){
        for(Employee employee: employeeManager)
            System.out.println(employee);
    }
}