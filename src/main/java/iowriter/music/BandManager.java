package iowriter.music;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BandManager {
    private List<Band> bands = new ArrayList<>();

    public void readBandsFromFile(Path file){
        try (BufferedReader reader = Files.newBufferedReader(file)){
            String line;
            while ((line = reader.readLine()) != null){
                String[] lineParts = line.split(";");
                bands.add(new Band(lineParts[0], Integer.parseInt(lineParts[1])));
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't read the file!");
        }
    }

    public void writeBandsBefore(Path file, int year){
        try (BufferedWriter writer = Files.newBufferedWriter(file)){
            for(Band band : bands){
                if(band.getYear() < year){
                    writer.write(band.getName() + ";" + band.getYear() + "\n");
                }
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't write the file!");
        }
    }

}
