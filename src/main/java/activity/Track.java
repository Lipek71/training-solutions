package activity;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }

    public Coordinate findMaximumCoordinate() {
        double maxX = 0;
        double maxY = 0;
        for (TrackPoint trackPoint : trackPoints) {
            if (trackPoint.getCoordinate().getLatitude() > maxX) {
                maxX = trackPoint.getCoordinate().getLatitude();
            }
            if (trackPoint.getCoordinate().getLongitude() > maxY) {
                maxY = trackPoint.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(maxX, maxY);
    }

    public Coordinate findMinimumCoordinate() {
        double minX = trackPoints.get(0).getCoordinate().getLatitude();
        double minY = trackPoints.get(0).getCoordinate().getLongitude();
        for (TrackPoint trackPoint : trackPoints) {
            if (trackPoint.getCoordinate().getLatitude() < minX) {
                minX = trackPoint.getCoordinate().getLatitude();
            }
            if (trackPoint.getCoordinate().getLongitude() < minY) {
                minY = trackPoint.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(minX, minY);
    }

    public double getDistance() {
        double distance = 0;
        if (trackPoints.size() > 1 || trackPoints == null) {
            for (int i = 1; i < trackPoints.size(); i++) {
                distance += trackPoints.get(i).getDistanceFrom(trackPoints.get(i - 1));
            }
        }
        return distance;
    }

    public double getFullDecrease() {
        double decrease = 0;

        if (trackPoints.size() > 1 || trackPoints == null) {
            for (int i = 1; i < trackPoints.size(); i++) {
                if (trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation() < 0) {
                    decrease += Math.abs(trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation());
                }
            }
        }
        return decrease;
    }

    public double getFullElevation() {
        double elevation = 0;

        if (trackPoints.size() > 1 || trackPoints == null) {
            for (int i = 1; i < trackPoints.size(); i++) {
                if (trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation() > 0) {
                    elevation += trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation();
                }
            }
        }
        return elevation;
    }

    public double getRectangleArea() {
        return Math.abs(findMaximumCoordinate().getLatitude() - findMinimumCoordinate().getLatitude()) * (findMaximumCoordinate().getLongitude() - findMinimumCoordinate().getLongitude());
    }

    public void loadFromGpx(InputStream inputStream){
        Coordinate coordinate = new Coordinate(0.0, 0.0);
        //Path file = Path.of("src/test/resources/track.gpx");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream)) ){
            String line ;

            while ((line = bufferedReader.readLine()) != null){
                if(line.contains("<trkpt lat=")){
                    //System.out.println(line.substring(15,25) + " " + line.substring(32,42));
                    //System.out.println(line);
                    coordinate = new Coordinate(Double.parseDouble(line.substring(15,25)), Double.parseDouble(line.substring(32,42)));
                }
                if(line.contains("<ele>")){
                    //System.out.println(line.substring(8,13));
                    //System.out.println(line);
                    trackPoints.add(new TrackPoint(coordinate, Double.parseDouble(line.substring(8,13)) ));
                }

            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't open the file!");
        }
    }
}
