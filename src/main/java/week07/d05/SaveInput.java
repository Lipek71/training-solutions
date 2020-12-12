package week07.d05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveInput {
    Scanner scanner;

    // Dependency Injection
    public SaveInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public List<String> readLine() {
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Add meg a " + i + ". sort");
            String line = scanner.nextLine();
            lines.add(line);
        }
        return lines;
    }

    public Path readFilename() {
        System.out.println("Add meg a file nevet: ");
        String filename = scanner.nextLine();
        Path path = Path.of(filename);
        return path;
    }

    public void write(Path path, List<String> lines) {
        try {
            Files.write(path, lines);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file!", ioe);
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SaveInput saveInput = new SaveInput(scanner);
        saveInput.write(saveInput.readFilename(), saveInput.readLine());
    }
}
