package week14.d04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTransformTest {

    @Test
    void transformToUppercased() {

        List<Employee> employeeList = List.of(
                new Employee("Lipka László"),
                new Employee("Lipka Gergely"),
                new Employee("Lipka Botond")
        );

        EmployeeTransform employeeTransform = new EmployeeTransform();

        assertEquals("[Employee{name='LIPKA LÁSZLÓ'}, Employee{name='LIPKA GERGELY'}, Employee{name='LIPKA BOTOND'}]", employeeTransform.transformToUppercased(employeeList).toString());
    }

    @Test
    void transformToUppercased2() {

        List<Employee> employeeList = List.of(
                new Employee("Lipka László"),
                new Employee("Lipka Gergely"),
                new Employee("Lipka Botond")
        );

        EmployeeTransform employeeTransform = new EmployeeTransform();

        assertEquals("[Employee{name='LIPKA LÁSZLÓ'}, Employee{name='LIPKA GERGELY'}, Employee{name='LIPKA BOTOND'}]", employeeTransform.transformToUppercased2(employeeList).toString());
    }

    @Test
    void transformToUppercased3() {

        List<Employee> employeeList = List.of(
                new Employee("Lipka László"),
                new Employee("Lipka Gergely"),
                new Employee("Lipka Botond")
        );

        EmployeeTransform employeeTransform = new EmployeeTransform();

        assertEquals("[Employee{name='LIPKA LÁSZLÓ'}, Employee{name='LIPKA GERGELY'}, Employee{name='LIPKA BOTOND'}]", employeeTransform.transformToUppercased3(employeeList).toString());
    }
}