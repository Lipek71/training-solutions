package _teszt;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Flights{
    public static void main(String... args) {
        PriorityQueue<Flight> flights = new PriorityQueue<Flight>(5, new SortQueueViaPriority());
        flights.add(new Flight("0001", 9));
        flights.add(new Flight("0002", 7));
        flights.add(new Flight("0003", 1));
        flights.add(new Flight("0004", 2));
        flights.add(new Flight("0005", 1));

        while (!flights.isEmpty())
            System.out.println(flights.remove());
    }
}

class SortQueueViaPriority implements Comparator<Flight> {
    @Override
    public int compare(Flight f1, Flight f2) {
        return Integer.compare(f2.getPriority(), f1.getPriority());
    }
}

class Flight {
    private final String name;
    private final int priority;

    Flight(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "name=" + name + " " +
                ", priority=" + priority +
                "}";
    }
}
