package week13.d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LongestNameTown {

    public String getLongestNameTown() {
        String longestNameTown = "";
        try (BufferedReader bf = Files.newBufferedReader(Path.of("src/main/java/week13/d01/iranyitoszamok-varosok-2021.csv"))) {
            String line = bf.readLine();
            while ((line = bf.readLine()) != null) {
                String[] lineParts = line.split(";");
                for (int i = 1; i < lineParts.length; i++){
                    if (lineParts[i].length() > longestNameTown.length()){
                        longestNameTown=lineParts[i];
                    }
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't open the file!", ioe);
        }
        return longestNameTown;
    }

}
