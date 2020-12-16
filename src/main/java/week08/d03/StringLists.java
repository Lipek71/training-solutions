package week08.d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringLists {
    public List<String> getShortestWords(List<String> words){
        List<String> shortestWords = new ArrayList<>();
        int shortestWordSize=getShortestWordSize(words);
        for(String part : words){
            if(part.length() == shortestWordSize){
                shortestWords.add(part);
            }
        }
        return shortestWords;
    }
    private int getShortestWordSize(List<String> words){
        int ShortestWordSize=words.get(0).length();
        for(String part : words){
            if (part.length() < ShortestWordSize){
                ShortestWordSize = part.length();
            }
        }
        return ShortestWordSize;
    }

}
