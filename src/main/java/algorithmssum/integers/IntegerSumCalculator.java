package algorithmssum.integers;

import java.util.Arrays;
import java.util.List;

public class IntegerSumCalculator {
    private List<Integer> numbers = Arrays.asList();

    public int sum(List<Integer> numbers){
        int sum=0;
        for(int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }
        return sum;
    }
}
