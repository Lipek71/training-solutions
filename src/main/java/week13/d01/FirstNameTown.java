package week13.d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.Collator;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeSet;

public class FirstNameTown {
    public String getFirstNameTown() {

        String firstNameTown = "";
        TreeSet towns = new TreeSet();

        try (BufferedReader bf = Files.newBufferedReader(Path.of("src/main/java/week13/d01/iranyitoszamok-varosok-2021.csv"))) {
            String line = bf.readLine();
            while ((line = bf.readLine()) != null) {
                String[] lineParts = line.split(";");
                for (int i = 1; i < lineParts.length; i++){
                    towns.add(new String2(lineParts[i]));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't open the file!", ioe);
        }

        return towns.first().toString();
    }
}

class String2 implements Comparable {

    public String value;
    private Collator collator = Collator.getInstance(new Locale("hu", "HU"));

    public String2(String value) {
        this.value = value;
    }

    public int compareTo(Object obj) {
        return collator.compare(value, obj.toString());
    }

    public String toString() {
        return value;
    }

    public boolean equals(Object obj) {
        return (obj.toString().equals(value));
    }
}
