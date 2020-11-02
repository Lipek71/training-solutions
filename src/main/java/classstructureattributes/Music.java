package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song1 = new Song();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dal adatainak megadása");

        System.out.println("Kérem a dal előadóját: ");
        song1.band = scanner.nextLine();

        System.out.println("Kérem a dal címét: ");
        song1.title = scanner.nextLine();

        System.out.println("Kérem a dal hosszát egész percben: ");
        song1.length = scanner.nextInt();
        scanner.nextLine();

        System.out.println("A kapott adatok: " + song1.band + " - " + song1.title + "( " + song1.length +" perc)");
    }
}
