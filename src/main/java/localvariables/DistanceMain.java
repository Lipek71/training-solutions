package localvariables;

public class DistanceMain {
    public static void main(String[] args) {

        Distance distance1 = new Distance();

        distance1.distanceInKm = 23.78;
        distance1.exact = false;

        System.out.println("A távolság: " + distance1.distanceInKm + " Pontos? " + distance1.exact);

        int distanceInKmEgesz;

        distanceInKmEgesz = (int) distance1.distanceInKm;

        System.out.println("Távolság egész része: " + distanceInKmEgesz);
    }
}
