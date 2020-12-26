package hackerrank;

import java.io.*;
import java.util.*;

public class Solution017 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String reverseValue;
        StringBuilder reverseA = new StringBuilder(A.toLowerCase().trim());
        reverseValue = reverseA.toString().equals(reverseA.reverse().toString()) ? "Yes" : "No";
        System.out.println(reverseValue);

    }
}