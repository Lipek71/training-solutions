package filescanner.bucketlist;


import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Bucketlist {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Path.of("src/main/java/filescanner/bucketlist/Bucketlist.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }
}
