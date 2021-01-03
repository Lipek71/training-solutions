package iozip.names;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class EmployeeFileManager {
    public void saveEmployees(Path filePath, List<String> employees){
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(filePath)))){
            zipOutputStream.putNextEntry(new ZipEntry("names.dat"));
            for(String employee : employees){
                zipOutputStream.write(employee.getBytes());
            }
    } catch (IOException ioe){
            throw new IllegalStateException("Can't write the file!", ioe);
        }
    }
}
