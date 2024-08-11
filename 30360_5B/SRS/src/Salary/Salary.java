package Salary;

import java.text.NumberFormat;

public class Salary implements ISalary {
    private double salary;

    public Salary(double salary){
        this.salary = salary;
        calculateSalary();
    }

    public void calculateSalary(){
        double hra, da, tax, grossSalary;

        hra = 0.1 * salary;
        da = 0.08 * salary;
        grossSalary = hra + da + salary;
        tax = 0.08 * grossSalary;
        this.salary = grossSalary - tax - (0.05 * grossSalary) - (0.02 * grossSalary);
    }
    public String formatSalary(){
        return NumberFormat.getCurrencyInstance().format(salary);
    }
}
