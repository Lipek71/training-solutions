package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OwlCounter {

    private Map<String, Integer> owlByCounty = new TreeMap<>();

    public void readFromFile(BufferedReader reader) throws IOException {
        String line;
        String[] lineParts;
        while ((line = reader.readLine()) != null) {
            lineParts = line.split("=");
            owlByCounty.put(lineParts[0], Integer.parseInt(lineParts[1]));
        }
    }

    public int getNumberOfOwls(String county) {
        return owlByCounty.get(county);
    }
}
