package week09.d02;

public class FibCalculator {
    public long fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public long sumEvents(int bound){
        int sumEventSmallThanBound=0;
        long fibNumber=0;
        int count=0;
        while(fibNumber <= bound){
            fibNumber = fib(count);
            if(fib(count) % 2 ==0){
                sumEventSmallThanBound+=fib(count);
            }
            count++;
        }
        return sumEventSmallThanBound;
    }

    public static void main(String[] args) {
        FibCalculator fibCalculator = new FibCalculator();
        System.out.println(fibCalculator.sumEvents(100));
    }
}
