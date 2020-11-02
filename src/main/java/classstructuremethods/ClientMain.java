package classstructuremethods;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client1 = new Client();
        System.out.println("Ügyfél adatainak megadása");

        System.out.println("Kérem az ügyfél nevét: ");

        client1.setName(scanner.nextLine());

        System.out.println("Kérem az ügyfél születési évét: ");
        client1.setYear(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Kérem az ügyfél címét: ");
        client1.setAddress(scanner.nextLine());

        System.out.println("A kapott adatok: név - " + client1.getName() + ", születési év - " + client1.getYear() + ", cím - " + client1.getAddress() +".");

        client1.migrate("Dunaharaszti");
        System.out.println("Az ügyfél új címe: " + client1.getAddress());

    }
}
