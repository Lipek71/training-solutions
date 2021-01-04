package iofiletest.cheese;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CheeseManager {
    public void saveToFile(Path filePath, List<Cheese> cheeseList){
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(filePath)))){
            for(Cheese cheese : cheeseList){
                dataOutputStream.writeUTF(cheese.toString());
                dataOutputStream.writeUTF("\n");
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't write the file!", ioe);
        }
    }

        public Cheese findCheese(Path filePath, String name){
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(filePath))) ){
                String line;
                while((line = bufferedReader.readLine()) != null){
                    if (line.split(",")[0].trim().equals(name)){
                        return new Cheese(line.split(",")[0].trim(),Double.parseDouble(line.split(",")[1].trim()));
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        return null;
    }

    public static void main(String[] args) {

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
        System.out.println(cheeseManager.findCheese(file, "Edami"));

    }
}
