package iowriter.names;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class NameWriter {
    private List<String> names = new ArrayList<>();
    private Path filePath;

    public NameWriter(Path filePath) {
        this.filePath = filePath;
    }

    public List<String> getNames() {
        return new ArrayList<>(names);
    }

    public void addAndWrite(String name) {
        names.add(name);
        try (BufferedWriter writer = Files.newBufferedWriter(filePath, StandardOpenOption.APPEND))
        {
            writer.write(name);
            writer.write("\n");
            /*if (Files.exists(filePath)){
                BufferedWriter writer = Files.newBufferedWriter(filePath, StandardOpenOption.APPEND);
                System.out.println("Nyitott");
                System.out.println(name);
                writer.write(name);
                writer.write("\n");
            } else {
                BufferedWriter writer = Files.newBufferedWriter(filePath);
                System.out.println("Új");
                writer.write(name);
                writer.write("\n");
            }*/
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can't write the file!", ioe);
        }
    }

    public static void main(String[] args) throws IOException {
        Path file = Path.of("test.txt");
        System.out.printf(file.toString());
        NameWriter nameWriter = new NameWriter(file);
        nameWriter.addAndWrite("John Smith");

        List<String> actual = Files.readAllLines(file);
        System.out.println(actual);
        System.out.println(nameWriter.getNames());

    }
}
