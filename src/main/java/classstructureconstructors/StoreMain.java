package classstructureconstructors;

import java.sql.SQLOutput;

public class StoreMain {
    public static void main(String[] args) {
        Store storeOne = new Store("Zaghegyező");
        Store storeTwo = new Store("Almareszelő");

        storeOne.store(300);
        System.out.println("StoreOne készlet: " + storeOne.getStock());
        storeTwo.store(550);
        System.out.println("StoreTwo készlet: " + storeTwo.getStock());
        storeOne.store(150);
        System.out.println("StoreOne készlet: " + storeOne.getStock());
        storeTwo.dispatch(250);
        System.out.println("StoreTwo készlet: " + storeTwo.getStock());
        storeOne.dispatch(400);
        System.out.println("StoreOne készlet: " + storeOne.getStock());
    }
}
