package lambdastreams.baseoperations;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    private final List<Integer> numbers;

    public Numbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public Optional<Integer> min(){
        return numbers.stream().min(Comparator.naturalOrder());
    }

    public int sum(){
        return numbers.stream().reduce(0, (a, b) -> a + b);
    }

    public List<Integer> getDistinctElements(){
        return numbers.stream().distinct().collect(Collectors.toList());
    }

    public boolean isAllPositive(){
        return numbers.stream().allMatch(n -> n > 0);
    }
}
