package iodatastream.statistics;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class HeightStatistics {

    public void saveHeights(List<Integer> heights, Path file) {
        try (OutputStream os = new BufferedOutputStream(Files.newOutputStream(file))) {
            os.write(0);
            for (Integer integer : heights){
                os.write(integer.byteValue());
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't write the file", ioe);
        }
    }
}
