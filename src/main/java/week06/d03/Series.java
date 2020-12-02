package week06.d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Series {

    public boolean numberTest(int number1, int number2) {
        return number1 < number2 ? true : false; //igaz -> nő, hamis -> csökken
    }

    public String calculateSeriesType(List<Integer> integerList) {

        if (integerList == null || integerList.size() < 2) {
            throw new IllegalArgumentException("The list is null or too short!");
        }

        boolean type = numberTest(integerList.get(0), integerList.get(1));
        int counter = 1;

        if (type) {
            while (type && counter < integerList.size()) {
                type = numberTest(integerList.get(counter - 1), integerList.get(counter++));
            }
            return type ? "növekvő" : "rendezetlen";
        } else {
            while (!type && counter < integerList.size()) {
                type = numberTest(integerList.get(counter - 1), integerList.get(counter++));
            }
            return type ? "rendezetlen" : "csökkenő";
        }
    }
}
