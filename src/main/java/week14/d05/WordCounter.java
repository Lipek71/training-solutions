package week14.d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class WordCounter {

    public long getWordHach(String file){
        try {
            Path path = Path.of(file);
            return Files
                    .lines(path)
                    .flatMap(line -> Arrays.stream(line.split(" ")))
                    .filter(word -> word.contains("Hach"))
                    .peek(line -> System.out.println(line))
                    .count();
        } catch (IOException ioe){
            throw new IllegalStateException("Can't open the file!", ioe);
        }
    }
}
