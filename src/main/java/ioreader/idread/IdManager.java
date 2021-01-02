package ioreader.idread;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IdManager {
    private List<String> ids = new ArrayList<>();

    public void readIdsFromFile(String filePath){
        Path file = Path.of("src/main/resources/" + filePath);
        try (BufferedReader reader = Files.newBufferedReader(file)){
            String line;
            while ((line = reader.readLine()) != null){
                ids.add(line);
            }

        } catch (IOException ioe){
            throw new IllegalArgumentException("Can't read the file", ioe);
        }
    }

    public List<String> getIds() {
        return new ArrayList<>(ids);
    }

    public static void main(String[] args) {
        IdManager idManager = new IdManager();
        System.out.println(idManager.getIds().size());
        idManager.getIds().add("test");
        System.out.println(idManager.getIds().size());
    }
}
