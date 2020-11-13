package classstructureintegrate;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        String name;
        int price;
        int change;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a termék nevét: ");
        name = scanner.nextLine();
        System.out.println("Kérem a termék árát: ");
        price = scanner.nextInt();
        scanner.nextLine();
        Product product = new Product(name, price);

        System.out.println("A termék neve: " + product.getName() + " és ára: " + product.getPrice());

        System.out.println("Mennyivel emeljem az árat: ");
        change = scanner.nextInt();
        scanner.nextLine();
        product.increasePrice(change);
        System.out.println("A termék neve: " + product.getName() + " és ára: " + product.getPrice());
        System.out.println("Mennyivel csökkentsem az árat: ");
        change = scanner.nextInt();
        scanner.nextLine();
        product.decreasePrice(change);
        System.out.println("A termék neve: " + product.getName() + " és ára: " + product.getPrice());
    }
}
