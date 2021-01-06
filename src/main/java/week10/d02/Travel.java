package week10.d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Travel {
    private List<Integer> stops = new ArrayList<>();

    public List<Integer> getStops() {
        return stops;
    }

    public int getStopWithMax(InputStream inputStream){
        readFile(inputStream);
        int[] stopArray =new int[31];
        for(int stop: stops){
            stopArray[stop]++;
        }
        return findMax(stopArray);
    }

    public void readFile(InputStream inputStream){
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineParts = line.split(" ");
                stops.add(Integer.parseInt(lineParts[0]));
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't open the file!",ioe);
        }
    }

    public int findMax(int[] stopArray){
        int stopMax = 0;
        int stopNumber = 0;
        for(int i = 0; i < stopArray.length; i++){
            if (stopArray[i] > stopMax) {
                stopMax = stopArray[i];
                stopNumber = i;
            }
        }
        return stopNumber;
    }
}
