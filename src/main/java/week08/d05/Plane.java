package week08.d05;

import java.io.FileReader;
import java.io.IOException;

public class Plane {
    public int flyAndCount() {
        int longPart = 0;
        int maxLongPart = 0;
        try {
            FileReader map = new FileReader("src/main/java/week08/d05/map.txt");
            int inByte;
            while ((inByte = map.read()) != -1) {
                if (inByte == 49) {
                    ++longPart;
                    if (longPart > maxLongPart) {
                        maxLongPart = longPart;
                    }
                } else {
                    longPart = 0;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file", ioe);
        }
        return maxLongPart;
    }
}