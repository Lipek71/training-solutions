package week07.d04;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

    public static final int INDEX_OF_AMOUNT = 1;
    public static final int INDEX_OF_PRICE = 2;
    public static final String LINE_SEPARATOR = ";";

    public long calculateSum(String path) {
        long sumOfGoods = 0;
        try (Scanner scanner = new Scanner(Path.of(path))) {
            scanner.useDelimiter(";");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineParts = line.split(";");
                System.out.println(lineParts[0] + ", " + lineParts[1] + ", " + lineParts[2]);
                sumOfGoods += Long.parseLong(lineParts[1]) * Long.parseLong(lineParts[2]);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
        return sumOfGoods;
    }

    public long calculateSum2(String path) {
        long sum = 0;
        // Checked kivétel
        try {
            List<String> lines = Files.readAllLines(Path.of(path), StandardCharsets.UTF_8);

            for (String line : lines) {

                long result = calculateLineSum(line);
                sum += result;
            }

        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file", ioe);
        }
        return sum;
    }

    public long calculateLineSum(String line) {
        String[] parts = line.split(LINE_SEPARATOR);

        long amount = Long.parseLong(parts[INDEX_OF_AMOUNT]);
        long price = Long.parseLong(parts[INDEX_OF_PRICE]);

        long result = amount * price;

        return result;
    }


    public static void main(String[] args) throws IOException {
        ShoppingList shoppingList = new ShoppingList();
        System.out.println(shoppingList.calculateSum("src/main/java/week07/d04/Goods.csv"));
        System.out.println(shoppingList.calculateSum2("src/main/java/week07/d04/Goods.csv"));
        //Path path = Path.of("alma/korte/eger.txt");
        //System.out.println(path.toRealPath());
    }
}
