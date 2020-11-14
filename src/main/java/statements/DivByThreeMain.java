package statements;

import java.util.Scanner;

public class DivByThreeMain {
    public static boolean DivByThree(int number){
        return number % 3 == 0;
    }
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy egész számot: ");
        number = scanner.nextInt();
        System.out.println("A szám osztható hárommal: " + DivByThree(number));
    }
}
