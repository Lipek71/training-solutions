package activity;

public class TrackPoint {
    private Coordinate coordinate;
    private double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }

    /*public double getDistanceFrom(TrackPoint trackPoint) {
        double x = coordinate.getLatitude() - trackPoint.getCoordinate().getLatitude();
        double y = coordinate.getLongitude() - trackPoint.getCoordinate().getLongitude();
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }*/

    public double getDistanceFrom(TrackPoint trackPoint) {

        double lat1 = coordinate.getLatitude();
        double lat2 = trackPoint.getCoordinate().getLatitude();
        double lon1 = coordinate.getLongitude();
        double lon2 = trackPoint.getCoordinate().getLongitude();
        double el1 = getElevation();
        double el2 = trackPoint.getElevation();

        final int R = 6371; // Radius of the earth

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters

        double height = el1 - el2;

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }


}
