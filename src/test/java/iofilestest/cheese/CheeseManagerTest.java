package iofilestest.cheese;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CheeseManagerTest {

    @Test
    void saveToFileTest() {
        Cheese cheese1 = new Cheese("Trappista", 10.5);
        Cheese cheese2 = new Cheese("Edami", 12.5);
        Cheese cheese3 = new Cheese("Parmezan", 11.5);
        Cheese cheese4 = new Cheese("Pannonia", 14.5);
        List<Cheese> cheeseList = new ArrayList<>();
        cheeseList.add(cheese1);
        cheeseList.add(cheese2);
        cheeseList.add(cheese3);
        cheeseList.add(cheese4);
        CheeseManager cheeseManager = new CheeseManager();
        Path file = Path.of("cheese.dat");
        cheeseManager.saveToFile(file, cheeseList);
        assertTrue(Files.exists(file));
    }

    @Test
    void findCheeseTest() {
        Cheese cheese1 = new Cheese("Trappista", 10.5);
        Cheese cheese2 = new Cheese("Edami", 12.5);
        Cheese cheese3 = new Cheese("Parmezan", 11.5);
        Cheese cheese4 = new Cheese("Pannonia", 14.5);
        List<Cheese> cheeseList = new ArrayList<>();
        cheeseList.add(cheese1);
        cheeseList.add(cheese2);
        cheeseList.add(cheese3);
        cheeseList.add(cheese4);
        CheeseManager cheeseManager = new CheeseManager();
        Path file = Path.of("cheese.dat");
        cheeseManager.saveToFile(file, cheeseList);
        assertEquals("Edami,12.5" ,cheeseManager.findCheese(file, "Edami").toString());
    }
}