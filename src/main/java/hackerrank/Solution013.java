package hackerrank;

import java.io.*;
import java.util.*;

public class Solution013 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int arrayGreatness = scanner.nextInt();
        int[] arrayValues = new int[arrayGreatness];
        for (int i = 0; i < arrayGreatness; i++) {
            arrayValues[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        int countNegative = 0;
        int sum = 0;
        for (int i = 0; i < arrayGreatness; i++) {
            for (int j = i; j < arrayGreatness; j++) {
                sum += arrayValues[j];
                if (sum < 0) {
                    countNegative++;
                }
            }
            sum=0;
        }
        System.out.println(countNegative);
    }
}