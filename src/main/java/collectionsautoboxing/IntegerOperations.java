package collectionsautoboxing;

import java.util.ArrayList;
import java.util.List;

public class IntegerOperations {

    public List<Integer> createList(int... numbers) {
        List<Integer> integerNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            integerNumbers.add(number);
        }
        return integerNumbers;
    }

    public int sumIntegerList(List<Integer> integerList) {
        int sum = 0;
        for (Integer number : integerList) {
            sum += number;
        }
        return sum;
    }

    public int sumIntegerObjects(Integer... integers) {
        int sum = 0;
        for (Integer number : integers) {
            sum += number;
        }
        return sum;
    }

}
