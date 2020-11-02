package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("Kérem adja meg a nevét: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Kérem adja meg az email címét: ");
        String email = scanner.nextLine();
        System.out.println("Ön a következő adatokkal regisztrált, név: " + name + ", email cím: " + email);
    }
}
