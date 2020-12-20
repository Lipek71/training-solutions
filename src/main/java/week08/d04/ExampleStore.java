package week08.d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ExampleStore {
    public List<String> getTitlesOfExamples(){
        List<String> titlesOfExamples = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                ExampleStore.class.getResourceAsStream("/examples.md")))){
            String line;
            while((line = reader.readLine()) != null){
                if(line.startsWith("#")){
                    titlesOfExamples.add("\n" + line.substring(2));
                }
            }
        }catch (IOException ioe){
            throw new IllegalArgumentException("Can not read file", ioe);
        }
        return titlesOfExamples;
    }

    public static void main(String[] args) {
        ExampleStore exampleStore = new ExampleStore();
        System.out.println(exampleStore.getTitlesOfExamples());
    }
}
