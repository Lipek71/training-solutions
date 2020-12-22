package week09.d02;

import java.util.ArrayList;
import java.util.List;

public class FibCalculator {
    List<String> stringList = new ArrayList<>();
    public long fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public long sumEvens(int bound) {
        int sumEvensSmallThanBound = 0;
        long fibNumber = 0;
        int count = 0;
        while (fibNumber <= bound) {
           if (fibNumber % 2 == 0) {
                sumEvensSmallThanBound += fibNumber;
            }
            count++;
            fibNumber = fib(count);

        }
        return sumEvensSmallThanBound;
    }

    public long sumEvens2(int bound) {
        int sumEvensSmallThanBound = 0;
        long fibNumber = 0;
        int count = 0;
        while (sumEvensSmallThanBound <= bound) {
            if (fibNumber % 2 == 0) {
                sumEvensSmallThanBound += fibNumber;
            }
            count++;
            fibNumber = fib(count);
        }
        return sumEvensSmallThanBound;
    }

    public static void main(String[] args) {
        FibCalculator fibCalculator = new FibCalculator();
        int bound = 7;
        System.out.println(fibCalculator.sumEvens(bound));
        System.out.println(fibCalculator.sumEvens2(bound));
    }
}
