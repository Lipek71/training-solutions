package week11.d01;

import java.util.ArrayList;
import java.util.List;

public class PairFinder {
    public int findPairs(int[] arr){
        int count = 0;
        List<Integer> simpleNumber = new ArrayList<>();
        for (Integer number : arr){
            if(simpleNumber.contains(number)){
                count++;
                simpleNumber.remove(number);
            } else {
                simpleNumber.add(number);
            }
        }
        return count;
    }
}
