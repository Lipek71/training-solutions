package intromethods;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Lipka László", 2020, 1000000);
        System.out.println(employee1);
        employee1.raiseSalary(500000);
        System.out.println(employee1);
    }
}
