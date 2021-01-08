package activity;

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

}
