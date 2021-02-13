package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StringToBytes {

    public void writeAsBytes(List<String> words, Path path){
        try (OutputStream os = new BufferedOutputStream(Files.newOutputStream(path))){
            for (String str: words){
                if(!str.startsWith("_")){
                    os.write(str.getBytes());
                }
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't write the file!", ioe);
        }
    }
}
