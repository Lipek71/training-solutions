package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Felhasználók listázása\n" +
                "2. Felhasználó felvétele\n" +
                "Többi: Kilépés");
        choice = scanner.nextInt();
        scanner.nextLine();
        if(choice == 1){
            System.out.println("Felhasználók listázása");
        }else if(choice == 2){
            System.out.println("Felhasználók felvétele");
        }
    }
}