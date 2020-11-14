package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        String name;
        String password1;
        String password2;
        String email;
        Scanner scanner = new Scanner(System.in);
        UserValidator userValidator = new UserValidator();
        System.out.println("Kérem a felhasználó nevet: ");
        name = scanner.nextLine();
        System.out.println(userValidator.isValidUsername(name) ? "Megfelelő a felhasználó név" : "Nem megfelelő a felhasználó név");
        System.out.println("Kérem a jelszót: ");
        password1 = scanner.nextLine();
        System.out.println("Kérem a jelszót még egyszer: ");
        password2 = scanner.nextLine();
        System.out.println(userValidator.isValidPassword(password1, password2) ? "Megfelelő a jelszó" : "Nem megfelelő a jelszó");
        System.out.println("Kérem az email címet: ");
        email = scanner.nextLine();
        System.out.println(userValidator.isValidEmail(email) ? "Megfelelő az email" : "Nem megfelelő az email");

    }
}
