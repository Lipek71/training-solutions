package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String us;
        us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        Locale indiaLocale = new Locale("en", "IN");
        String india;
        india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
        String china;
        china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france;
        france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}