package ioreadstring.names;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private Path myFile;
    private List<Human> humans = new ArrayList<>();

    public FileManager(String myFile) {
        this.myFile = Path.of(myFile);
    }

    public void readFromFile(){
        try {
            List<String> fileLines = Files.readAllLines(myFile);
            for (String str : fileLines) {
                String line[] = str.split(" ");
                humans.add(new Human(line[0], line[1]));
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
    }

    public Path getMyFile() {
        return this.myFile;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public static void main(String[] args) {
        FileManager fm = new FileManager("src/main/resources/names.txt");
        System.out.println(fm.getMyFile().getFileName().toString());
        System.out.println(fm.getMyFile().toString());
        fm.readFromFile();
    }
}
