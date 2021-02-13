package week14.d04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeTransform {

    public List<Employee> transformToUppercased(List<Employee> employees) {
        List<Employee> uppercasedEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            uppercasedEmployees.add(new Employee(employee.getName().toUpperCase()));
        }
        return uppercasedEmployees;
    }

    public List<Employee> transformToUppercased2(List<Employee> employees) {

        return employees.stream()
                .map(employee -> employee.toUppercase())
                .collect(Collectors.toList());
    }

    public List<Employee> transformToUppercased3(List<Employee> employees) {

        return employees.stream()
                .map(Employee::toUppercase)
                .collect(Collectors.toList());
    }

}
