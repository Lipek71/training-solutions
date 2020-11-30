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
}
