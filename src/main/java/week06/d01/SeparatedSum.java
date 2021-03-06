package week06.d01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparatedSum {
    public List<Double> sum(String s) {
        List<Double> sums = new ArrayList<>();
        double sumPositive = 0;
        double sumNegative = 0;
        s = s.replaceAll(",", ".");
        String[] numbers = s.split(";");
        for (String number : numbers) {
            if (Double.parseDouble(number) > 0) {
                sumPositive += Double.parseDouble(number);
            } else {
                sumNegative += Double.parseDouble(number);
            }
        }
        sums.add(sumPositive);
        sums.add(sumNegative);
        return sums;
    }

    public SeparatedSumBack sum2(String s) {
        double[] sums = new double[2];
        double sumPositive = 0;
        double sumNegative = 0;
        s = s.replaceAll(",", ".");
        String[] numbers = s.split(";");
        for (String number : numbers) {
            if (Double.parseDouble(number) > 0) {
                sumPositive += Double.parseDouble(number);
            } else {
                sumNegative += Double.parseDouble(number);
            }
        }
        SeparatedSumBack result = new SeparatedSumBack(sumPositive, sumNegative);
        return result;
    }

    public String sum3(String s) {
        double[] sums = new double[2];
        double sumPositive = 0;
        double sumNegative = 0;
        s = s.replaceAll(",", ".");
        String[] numbers = s.split(";");
        for (String number : numbers) {
            if (Double.parseDouble(number) > 0) {
                sumPositive += Double.parseDouble(number);
            } else {
                sumNegative += Double.parseDouble(number);
            }
        }
        sums[0]=sumPositive;
        sums[1]=sumNegative;
        return sumPositive + ", " + sumNegative;
    }
    public static void main(String[] args) {
        SeparatedSum separatedSum = new SeparatedSum();
        System.out.println(separatedSum.sum("4;-3"));
        SeparatedSumBack result = new SeparatedSumBack(0,0);
        separatedSum.sum2("4;-3");
        System.out.println(result.getSumNegative());
        System.out.println(separatedSum.sum3("4;-3"));
    }
}
