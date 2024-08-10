package Employee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeManagerTest {
    static EmployeeManager employeeManager = new EmployeeManager();

    @Test
    void getEmployee() {
        assertNull(employeeManager.getEmployee("30360"));
    }

    @Test
    void isEmployee() {
        assertFalse(employeeManager.isEmployee("30360"));
    }

    @Test
    void fireEmployee() {
        assertFalse(employeeManager.fireEmployee("30360"));
    }

    @Test
    void updateEmployeeRole() {
        assertFalse(employeeManager.updateEmployeeRole("30360", "ceo"));
    }

    @Test
    void updateEmployeeSalary() {
        assertFalse(employeeManager.updateEmployeeSalary("30360", "5000000"));
    }
}