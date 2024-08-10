package Employee;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeManager {
    private static final List<IEmployee> employees = new ArrayList<>();

    public IEmployee getEmployee(String employeeId){
        for(IEmployee i: employees){
            if(Objects.equals(employeeId, i.getEmployeeId()))
                return i;
        }
        return null;
    }
    public boolean isEmployee(String employeeId){
        for(IEmployee i: employees){
            if(Objects.equals(employeeId, i.getEmployeeId()))
                return true;
        }
        return false;
    }
    public boolean recruitEmployee(IEmployee employee){
        if(isEmployee(employee.getEmployeeId()))
            return false;
        return employees.add(employee);
    }
    public boolean fireEmployee(String employeeId){
        if(!isEmployee(employeeId))
            return false;
        return employees.remove(getEmployee(employeeId));
    }
    private double calculateSalary(double employeeSalary){
        double hra, da, tax, grossSalary;

        hra = 0.1 * employeeSalary;
        da = 0.08 * employeeSalary;
        grossSalary = hra + da + employeeSalary;
        tax = 0.05 * grossSalary;
        return grossSalary - tax - (0.2 * grossSalary) - (0.1 * grossSalary);
    }
    public String formatSalary(String employeeSalary){
        return NumberFormat.getCurrencyInstance().format(calculateSalary(Double.parseDouble(employeeSalary)));
    }
    public void listAllEmployees(){
        for(IEmployee i: employees)
            System.out.println(i);
    }
    public boolean updateEmployeeRole(String employeeId, String updatedEmployeeRole){
        if(isEmployee(employeeId)){
            getEmployee(employeeId).setEmployeeRole(updatedEmployeeRole);
            return true;
        }
        return false;
    }
    public boolean updateEmployeeSalary(String employeeId, String updatedEmployeeSalary){
        if(isEmployee(employeeId)){
            getEmployee(employeeId).setEmployeeSalary(formatSalary(updatedEmployeeSalary));
            return true;
        }
        return false;
    }
}
