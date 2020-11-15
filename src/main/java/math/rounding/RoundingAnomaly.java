package math.rounding;

import java.util.Random;

public class RoundingAnomaly {

    private double[] randomNumbers(int size, double max, int scale) {
        double[] randomNumbers = new double[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i ++) {
            randomNumbers[i] = Math.round(rnd.nextDouble() * max * Math.pow(10, scale)) / Math.pow(10, scale);
        }
        return randomNumbers;
    }

    private double roundAfterSum(double[] randomNumbers) {
        double sum = 0;
        for (double number : randomNumbers) {
            sum = sum + number;
        }
        return Math.round(sum);
    }

    private double sumAfterRound(double[] randomNumbers) {
        double sum = 0;
        for (double number : randomNumbers) {
            sum = sum + Math.round(number);
        }
        return sum;
    }

    public double difference(int size, double max, int scale) {
        double[] numbers = randomNumbers(size, max, scale);
        double resultAfterSum = roundAfterSum(numbers);
        double resultAfterRound = sumAfterRound(numbers);
        return Math.abs(resultAfterSum - resultAfterRound);
    }
    public static void main(String[] args) {
        RoundingAnomaly roundingAnomaly = new RoundingAnomaly();
        int count = 100;
        double sum = 0;
        for (int i = 0; i < count; i++) {
            double diff = roundingAnomaly.difference(1000, 1000000, 5);
            sum += diff;
            System.out.println("Diff: " + diff);
        }
        System.out.println(sum / count);
    }
}
