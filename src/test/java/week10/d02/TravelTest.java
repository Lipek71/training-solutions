package week10.d02;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TravelTest {

    @Test
    void getStopWithMaxTest() throws IOException {
        //Path file = Path.of("src/main/resources/week10/d02/utasadat.txt");
        //Path file = Path.of("src","main","resources","week10","d02","utasadat.txt");
        Path file = Path.of("src","main","resources","week10","d02").resolve("utasadat.txt");

        InputStream inputStream = Files.newInputStream(file);
        Travel travel = new Travel();
        assertEquals(10, travel.getStopWithMax(inputStream));
    }

    @Test
    void readFileTest() throws IOException {
        int count=0;
        Path file = Path.of("src/main/resources/week10/d02/utasadat.txt");
        InputStream inputStream = Files.newInputStream(file);
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                count++;
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't open the file!", e);
        }
        assertEquals(35, count);
    }

    @Test
    void findMaxTest() {
        Travel travel = new Travel();
        int [] stopMax = {1,1,2,4,12,15,15,12,15,23,15,15};
        assertEquals(9, travel.findMax(stopMax));
    }
}