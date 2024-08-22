package Comaparable;

import Comaparable.Employee.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(30360, "Chakri"));
        employees.add(new Employee(30164, "Rohit"));
        employees.add(new Employee(30178, "Navya"));

        Collections.sort(employees);

        for(Employee employee: employees)
            System.out.println(employee);
    }
}
