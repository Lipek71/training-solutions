package ioprintwriter.salary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SalaryWriter {
    private List<String> names= new ArrayList<>();

    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    public void writeNamesAndSalaries(Path file){
        try(PrintWriter writer = new PrintWriter(Files.newBufferedWriter(file))){
            for(String name : names){
               String[] lineParts = name.toLowerCase().split(" ");
               if ("dr.".equals(lineParts[0])){
                   writer.print(name + ": ");
                   writer.println(500000);
               } else if ("mr.".equals(lineParts[0]) || "mrs.".equals(lineParts[0])){
                   writer.print(name + ": ");
                   writer.println(200000);
               } else {
                   writer.print(name + ": ");
                   writer.println(100000);
               }
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't read the file!");
        }
    }
}
