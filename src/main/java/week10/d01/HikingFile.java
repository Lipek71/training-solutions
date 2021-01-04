package week10.d01;

import java.io.*;

public class HikingFile {
    private int height = -1;

    public Elevations getElevation(InputStream inputStreamGPS) {
        int elevationUp = 0;
        int elevationDown = 0;
        int elevationBefore = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamGPS))) {
            String line;
            if ((line = bufferedReader.readLine()) != null) {
                elevationBefore = Integer.parseInt(line.split(" ")[2]);
            }
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                if (Integer.parseInt(line.split(" ")[2]) > elevationBefore) {
                    elevationUp += Integer.parseInt(line.split(" ")[2]) - elevationBefore;
                } else {
                    elevationDown += elevationBefore - Integer.parseInt(line.split(" ")[2]);
                }
                elevationBefore = Integer.parseInt(line.split(" ")[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Elevations(elevationUp, elevationDown);
    }

    public void getElevation2(InputStream inputStreamGPS) {
        Elevations2 elevations2 = new Elevations2();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamGPS))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineParts = line.split(", ");
                int actHeight = Integer.parseInt(lineParts[2]);
                if (height > -1) {
                    if (actHeight > height) {
                        elevations2.upInc(actHeight - height);
                    } else {
                        elevations2.downInc(height - actHeight);
                    }
                }
                height = actHeight;
            }
        } catch (IOException ioe) {
            throw new IllegalStateException(" ", ioe);
        }
    }
}
