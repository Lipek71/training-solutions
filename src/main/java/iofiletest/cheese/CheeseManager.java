package iofiletest.cheese;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheeseManager {
    public void saveToFile(Path filePath, List<Cheese> cheeseList){
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(filePath)))){
            for(Cheese cheese : cheeseList){
                dataOutputStream.writeUTF(cheese.getName());
                dataOutputStream.writeDouble(cheese.getLactoz());
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't write the file!", ioe);
        }
    }

    public Cheese findCheese(Path filePath, String name){
        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(filePath))){
            byte[] line;
            line = inputStream.readAllBytes();
        } catch (IOException ioe){
            throw new IllegalStateException("Can't write the file!", ioe);
        }
        return null;
    }

    public static void main(String[] args) {

        Cheese cheese1 = new Cheese("Trapista", 10.5);
        Cheese cheese2 = new Cheese("Trapista", 10.5);
        Cheese cheese3 = new Cheese("Trapista", 10.5);
        Cheese cheese4 = new Cheese("Trapista", 10.5);

        List<Cheese> cheeseList = new ArrayList<>();
        cheeseList.add(cheese1);
        cheeseList.add(cheese2);
        cheeseList.add(cheese3);
        cheeseList.add(cheese4);

        CheeseManager cheeseManager = new CheeseManager();
        cheeseManager.saveToFile(Path.of("cheese.dat"), cheeseList);
        Path file = Path.of("cheese.dat");

        try (DataInputStream dataInputStream = new DataInputStream(Files.newInputStream(file))){
            byte[] bytes;
            bytes = dataInputStream.readAllBytes();
            System.out.println(Arrays.toString(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
