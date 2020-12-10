package week07.d04;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ShoppingList {
    public long calculateSum(String path) {
        long sumOfGoods = 0;
        try (Scanner scanner = new Scanner(Path.of(path))) {
            scanner.useDelimiter(";");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineParts = line.split(";");
                System.out.println(lineParts[0] + ", " + lineParts[1] + ", " + lineParts[2]);
                sumOfGoods += Long.parseLong(lineParts[1])* Long.parseLong(lineParts[2]);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
        return sumOfGoods;
    }

    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList();
        System.out.println(shoppingList.calculateSum("src/main/resources/goods.csv"));
    }
}
