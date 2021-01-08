package week10.d05;

import java.util.Scanner;

public class Calculator {
    public CalculatorResult findMinMaxSum(int[] arr) {
        int min = 0;
        int max = 0;
        int[] sortedArr = sorter(arr);
        if (sortedArr.length <= 4) {
            for (int i = 0; i < sortedArr.length; i++) {
                min += sortedArr[i];
            }
            max = min;
        } else {
            for (int i = 0; i <= 3; i++) {
                min += sortedArr[i];
                max += sortedArr[sortedArr.length - i - 1];
            }
        }
        return new CalculatorResult(min, max);
    }

    public int[] sorter(int[] arr) {
        int tmp;
        int[] sortedArr = arr;
        if (arr.length >= 2) {
            for (int i = sortedArr.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (sortedArr[j] > sortedArr[j + 1]) {
                        tmp = sortedArr[j];
                        sortedArr[j] = sortedArr[j + 1];
                        sortedArr[j + 1] = tmp;
                    }
                }
            }
        }
        return sortedArr;
    }

    public static void main(String[] args) {
        int count;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány elemű a tömb: ");
        count = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Kérem az " + i + 1 + ". számot:");
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }
        Calculator calculator = new Calculator();
        CalculatorResult calculatorResult = calculator.findMinMaxSum(arr);
        System.out.println("Min: " + calculatorResult.getMin() + " Max: " + calculatorResult.getMax());
    }
}
