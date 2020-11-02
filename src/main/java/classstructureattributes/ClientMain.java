package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client1 = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ügyfél adatainak megadása");

        System.out.println("Kérem az ügyfél nevét: ");
        client1.name = scanner.nextLine();

        System.out.println("Kérem az ügyfél születési évét: ");
        client1.year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem az ügyfél címét: ");
        client1.address = scanner.nextLine();

        System.out.println("A kapott adatok: név - " + client1.name + ", születési év - " + client1.year + ", cím - " + client1.address +".");
    }
}
