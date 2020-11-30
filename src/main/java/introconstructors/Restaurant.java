package introconstructors;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<String> menu = new ArrayList<>();
    private String name;
    private int capacity;

    public Restaurant(String name, int capacity) {
        this.name = name;
        this.capacity = capacity * 4;
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void fillMenu(){
        menu.add("Milánói makaróni");
        menu.add("\nHortobágyi palacsninta");
        menu.add("\nBableves");
        menu.add("\nCordon bleu");
        menu.add("\nBécsi szelet");
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Sárga Kacsa Vendéglő", 15);
        restaurant.fillMenu();
        System.out.println("A vendéglő neve: " + restaurant.getName() + ", kapacitása: " + restaurant.getCapacity() + ".");
        System.out.println("A menü: \n" + restaurant.getMenu());
    }
}
