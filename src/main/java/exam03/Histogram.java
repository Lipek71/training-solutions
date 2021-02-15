package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Histogram {
    StringBuilder output;
    public String createHistogram(BufferedReader reader) {
        try (BufferedReader bf = reader) {
            String line;
            while ((line = bf.readLine()) != null) {
                for(int i = 0; i <Integer.parseInt(line); i++ ){
                    output.append("*");
                }
                output.append("\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't open the file!", ioe);
        }
        return output.toString();
    }

}
