package ioreadwritebytes.temperatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesReader {
    public Temperatures readTemperatures(String filePath){
        byte[] temperatures;
        Path file = Path.of(filePath);
        try {
            temperatures = Files.readAllBytes(file);
        } catch (IOException e) {
            throw new IllegalArgumentException("Can't read the file!", e);
        }
        return new Temperatures(temperatures);
    }
}
