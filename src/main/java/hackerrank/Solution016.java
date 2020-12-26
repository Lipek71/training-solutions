package hackerrank;

import java.util.Scanner;

public class Solution016 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        int count = 0;
        for (int i = 0; i <= s.length() - k; i++) {
            while (count < k && s.substring(i, i + k).charAt(count) == smallest.charAt(count)) {
                count++;
            }
            if (count == k) {
                count--;
            }
            if (s.substring(i, i + k).charAt(count) < smallest.charAt(count)) {
                smallest = s.substring(i, i + k);
            }
            count=0;
            while (count < k && s.substring(i, i + k).charAt(count) == largest.charAt(count)) {
                count++;
            }
            if (count == k) {
                count--;
            }
            if (s.substring(i, i + k).charAt(count) > largest.charAt(count)) {
                largest = s.substring(i, i + k);
            }
            count = 0;
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        //         System.out.println(B.charAt(0) < A.charAt(0) ? "Yes" : "No");
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}