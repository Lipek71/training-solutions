package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Kérek két egész számot!");
        System.out.println("Az első szám: ");
        Scanner scanner = new Scanner(System.in);
        int szamElso = scanner.nextInt();
        scanner.nextLine();
        System.out.println("A második szám: ");
        int szamMasodik = scanner.nextInt();
        scanner.nextLine();
        System.out.println(szamElso + " + " + szamMasodik);
        System.out.println(szamElso + szamMasodik);
    }
}
