package debug.employees;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Lipka László", 1971);
        Employee employee2 = new Employee("Mismás Zsuzsanna", 1973);
        Employee employee3 = new Employee("Czank Zsófia", 2000);
        Employee employee4 = new Employee("Czank Balázs", 2002);

        Company company = new Company(new ArrayList<>());

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);
        company.addEmployee(employee4);

        Employee findZsuzsa = company.findEmployeeByName("Mismás Zsuzsanna");
        System.out.println(findZsuzsa.getName() + " " + findZsuzsa.getYearOfBirth());

        List<String> names = company.listEmployeeNames();
        System.out.println(names);
    }
}
