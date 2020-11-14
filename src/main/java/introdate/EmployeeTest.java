package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        String name;
        int dateOfBirthYear;
        int dateOfBirthMonth;
        int dateOfBirthDay;
        LocalDate dateOfBirth;
        LocalDateTime beginEmployment;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a dolgozó nevét: ");
        name = scanner.nextLine();
        System.out.println("Kérem a dolgozó születési évét: ");
        dateOfBirthYear = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem a dolgozó születési hónapját: ");
        dateOfBirthMonth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem a dolgozó születési napját: ");
        dateOfBirthDay = scanner.nextInt();
        scanner.nextLine();

        dateOfBirth = LocalDate.of(dateOfBirthYear, dateOfBirthMonth, dateOfBirthDay);
        Employee employee = new Employee(name,dateOfBirth, LocalDateTime.now());

        System.out.println("A dolgozó neve: " + employee.getName() + ", születési dátuma: " + employee.getDateOfBirth() + ", belépési ideje: " + employee.getBeginEmployment());


    }
}
