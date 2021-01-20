package week12.d02;

import org.yaml.snakeyaml.reader.StreamReader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LandReader {
    private int lastHouseNumber;
    private Set<Land> landSet = new TreeSet<>();
    private Set<Land> landOddSet = new TreeSet<>(); //(1)KKKKKKKK(3)::::::::::(5)SSSSSSSSS

    public void readLand(InputStream is) {
        int countEven = 2;
        int countOdd = 1;

        int houseNumber;
        int fenceWidth;
        String fenceColor;
        Land land = null;

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(is));) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] lineParts = line.split(" ");
                fenceWidth = Integer.parseInt(lineParts[1]);
                fenceColor = lineParts[2];
                if (lineParts[0].equals("0")) {
                    houseNumber = countEven;
                    lastHouseNumber = countEven;
                    countEven += 2;
                    land = new Land(Integer.parseInt(lineParts[0]), fenceWidth, fenceColor, houseNumber);
                    landSet.add(land);
                } else {
                    houseNumber = countOdd;
                    lastHouseNumber = countOdd;
                    countOdd += 2;
                    land = new Land(Integer.parseInt(lineParts[0]), fenceWidth, fenceColor, houseNumber);
                    landSet.add(land);
                    landOddSet.add(land);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file!", ioe);
        }
    }

    public Set<Land> getLandSet() {
        return landSet;
    }

    public int getLastHouseNumber() {
        return lastHouseNumber;
    }

    public void printLandOddSet(String file) {
        Path path = Path.of(file);
        List<Land> landList = new ArrayList<>();
        try (BufferedWriter bw = Files.newBufferedWriter(path)) {
            String line;
            for(Land land : landOddSet){
                line = land.toString();
                bw.write(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file!", ioe);
        }
    }
}
