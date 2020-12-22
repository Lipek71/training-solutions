package week09.d02;

public class FibCalculator {
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
            fibNumber = fib(count);
            if (fibNumber % 2 == 0) {
                sumEvensSmallThanBound += fibNumber;
            }
            count++;
        }
        return sumEvensSmallThanBound;
    }

    public long sumEvens2(int bound) {
        int sumEvensSmallThanBound = 0;
        long fibNumber = 0;
        int count = 0;
        while (fibNumber <= bound) {
            if (fibNumber % 2 == 0) {
                sumEvensSmallThanBound += fibNumber;
            }
            fibNumber = fib(count);
            count++;
        }
        return sumEvensSmallThanBound;
    }

    public static void main(String[] args) {
        FibCalculator fibCalculator = new FibCalculator();
        System.out.println(fibCalculator.sumEvens(35));
    }
}
