package exam03;

import org.apache.tools.ant.taskdefs.Copy;

import java.text.Collator;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Cruise {
    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void bookPassenger(Passenger passenger) {
        if (passengers.size() == boat.getMaxPassengers()) {
            throw new IllegalArgumentException("No more space on the boat :(");
        }
        passengers.add(passenger);
    }

    public double getPriceForPassenger(Passenger passenger) {
        return passenger.getCruiseClass().getValue() * this.basicPrice;
    }

    public Passenger findPassengerByName(String name) {
        Passenger foundPassenger = null;
        for (Passenger passenger : passengers){
            if(passenger.getName().toLowerCase().equals(name.toLowerCase())){
                foundPassenger = passenger;
            }
        }
        return foundPassenger;
    }

    public List<String> getPassengerNamesOrdered(){
        List<String> orderedPassengers = new ArrayList<>();
        for (Passenger passenger : passengers){
            orderedPassengers.add(passenger.getName());
        }

        Collections.sort(orderedPassengers, Collator.getInstance(new Locale("hu", "HU")));
        return orderedPassengers;
    }

    public double sumAllBookingsCharged(){
        double sumAllBookingsCharged = 0;
        for (Passenger passenger: passengers){
            sumAllBookingsCharged += passenger.getCruiseClass().getValue() * this.basicPrice;
        }
        return sumAllBookingsCharged;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> passengerByClass = new HashMap<>();

        return passengerByClass;
    }
}
