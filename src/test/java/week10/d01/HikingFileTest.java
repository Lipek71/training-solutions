package week10.d01;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HikingFileTest {

    @Test
    void getElevation() {
        HikingFile hikingFile = new HikingFile();
        Path file = Path.of("src/main/resources/gps/gpspoints.txt");
        try {
            InputStream inputStream = Files.newInputStream(file);
            assertEquals("Elevations{up=60, down=50}", hikingFile.getElevation(inputStream).toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}