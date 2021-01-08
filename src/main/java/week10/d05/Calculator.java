package week10.d05;

import java.util.ArrayList;
import java.util.List;
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

    public int[] arrayRequest() {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        String s = scanner.nextLine();
        int number;
        while (!s.isBlank()) {
            /*try {
                numbers.add(Integer.parseInt(s));
            } catch (NumberFormatException nfe) {
                System.out.println("Please a number!");
            }*/
            number=validator(s);
            numbers.add(number);
            s = scanner.nextLine();
        }
        int[] data = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            data[i] = numbers.get(i);
        }
        return data;
    }

    public int validator(String str) {
        int number;
        Scanner scanner = new Scanner(System.in);
        String s;
        try {
            number = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            System.out.println("Please a number!");
            s = scanner.nextLine();
            number = validator(s);
        }
        return number;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Kérem a számokat: ");
        int[] data = calculator.arrayRequest();
        CalculatorResult calculatorResult = calculator.findMinMaxSum(data);
        System.out.println("Min: " + calculatorResult.getMin() + " Max: " + calculatorResult.getMax());
    }
}
