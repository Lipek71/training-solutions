package week07.d01;

public class Fibonacci {
    long fibonacci0 = 0;
    long fibonacci1 = 1;
    long fibonaccin = 0;

    public long fib1(int n) {
        long fibonacci10 = 0;
        long fibonacci11 = 1;
        long fibonacci1n = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 0; i < n - 1; i++) {
            fibonacci1n = fibonacci10 + fibonacci11;
            fibonacci10 = fibonacci11;
            fibonacci11 = fibonacci1n;
        }

        return fibonaccin;
    }

    public long fib2(int n) {
        if (n <= 1) {
            return n;
        }
        return fib2(n - 1) + fib2(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i < 11; i++) {
            System.out.println("Az " + i + ". Fibonacci szám: " + fibonacci.fib1(i));
        }
        for (int i = 0; i < 11; i++) {
            System.out.println("Az " + i + ". Fibonacci szám: " + fibonacci.fib2(i));
        }
    }
}

