package recursion;

public class Factorial {
    public static long factorial(int factorial) {
        if (factorial > 1) {
            long solution = factorial(factorial - 1);
            return factorial * solution;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        for(int i=0; i < 11; i++){
            System.out.println(i + " faktoriálisa: " + factorial(i));
            System.out.println();
        }

    }
}
