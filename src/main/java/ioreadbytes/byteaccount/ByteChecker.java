package ioreadbytes.byteaccount;

import java.awt.*;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class ByteChecker {

    public int readBytesAndFindAs(String filePath) {
        Path file = Path.of(filePath);
        int count = 0;
        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(file))) {
            byte[] bytes = inputStream.readAllBytes();
            for (int i = 0; i < bytes.length; i++) {
                if(bytes[i]==97){
                    count++;
                }
            }
            System.out.println(Arrays.toString(bytes));
            System.out.println(count);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
        return count;
    }

    public static void main(String[] args) {
        ByteChecker byteChecker = new ByteChecker();
        byteChecker.readBytesAndFindAs("src/main/resources/ioreadbytes/byteaccount/talents.txt");
    }
}
