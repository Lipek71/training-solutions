package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Histogram {


    public String createHistogram(BufferedReader reader) throws IOException {
        StringBuilder output = new StringBuilder();
        String line;
        String STAR = "*";
        while ((line = reader.readLine()) != null) {
            output.append(STAR.repeat(Integer.parseInt(line))).append("\n");
        }
        return output.toString();
    }

    /*public static void main(String[] args) throws IOException {
        try (BufferedReader bf = Files.newBufferedReader(Path.of("src/main/resources/histogram.txt"))){
            String line = "";
            StringBuilder output = new StringBuilder();
            while ((line = bf.readLine()) != null){
                System.out.println(line);
                for (int i =0; i < Integer.parseInt(line); i++){
                    output.append("*");
                }
                output.append("\n");
            }
            System.out.println(output);
        } catch (IOException ioe){
            throw new IllegalStateException("Can't open the file!", ioe);
        }

        Histogram histogram = new Histogram();
        BufferedReader reader = new BufferedReader(new InputStreamReader(Histogram.class.getResourceAsStream("/histogram.txt")));
        histogram.createHistogram(reader);
    }*/
}
