package numbers;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(String.format(Locale.US, "%.2f", rnd.nextDouble() * 10));
        double b = Double.parseDouble(String.format(Locale.US, "%.2f", rnd.nextDouble() * 50));
        double result;
        System.out.println("Mi az eredménye a következő műveletnek: " + a + "/2*" + b);
        result = scanner.nextDouble();
        System.out.println();
        if(Math.abs(result - (a/2*b)) < 0.0001){
            System.out.println("Helyes az eredmény!");
        } else {
            System.out.println("Helytelen az eredmény");
        }
    }
}
