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
        /*for (Passenger passenger : passengers) {
            if (passenger.getName().toLowerCase().equals(name.toLowerCase())) {
                foundPassenger = passenger;
            } else {
            throw new IllegalArgumentException("No found passenger with this name: " + name);
        }*/
        foundPassenger= passengers.stream()
                .filter(passenger -> passenger.getName().equals(name))
                .collect(Collectors.toList()).get(0);
        if(foundPassenger!=null){
            return foundPassenger;
        } else {
            throw new IllegalArgumentException("No found passenger with this name: " + name);
        }
        //Ezt inkább nem kellene streammel csinálni, szerintem
    }

    public List<String> getPassengerNamesOrdered() {
        /*List<String> orderedPassengers = new ArrayList<>();
        for (Passenger passenger : passengers) {
            orderedPassengers.add(passenger.getName());
        }

        Collections.sort(orderedPassengers, Collator.getInstance(new Locale("hu", "HU")));*/
        return passengers.stream()
                .map(Passenger::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public double sumAllBookingsCharged() {
        /*double sumAllBookingsCharged = 0;
        for (Passenger passenger : passengers) {
            sumAllBookingsCharged += passenger.getCruiseClass().getValue() * this.basicPrice;
        }*/
        return passengers.stream()
                .mapToDouble(this::getPriceForPassenger)
                .sum();
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        /*Map<CruiseClass, Integer> passengerByClass = new TreeMap<>();
        for (Passenger passenger : passengers){
            if(!passengerByClass.containsKey(passenger.getCruiseClass())){
                passengerByClass.put(passenger.getCruiseClass(), 1L);
            } else {
                passengerByClass.put(passenger.getCruiseClass(), passengerByClass.get(passenger.getCruiseClass()) + 1);
            }
        }*/
        /*passengerByClass = passengers.stream()
                .collect(Collectors.groupingBy(Passenger::getCruiseClass
                        ,TreeMap::new
                        ,Collectors.counting()));*/ //Ez long-t ad vissza, de szerintem elegánsabb
        return passengers.stream()
                .collect(Collectors.toMap(Passenger::getCruiseClass
                        ,p->1
                        ,Integer::sum
                        ,TreeMap::new));
    }
}
