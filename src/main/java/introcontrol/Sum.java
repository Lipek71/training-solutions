package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i=1; i<6; i++){
            System.out.println("Kérem a " + i + ". számot: ");
            number = scanner.nextInt();
            scanner.nextLine();
            sum += number;
        }
        System.out.println("A végösszeg: " + sum);
    }
}
