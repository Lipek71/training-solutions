package hackerrank;

import java.io.*;
import java.util.*;

public class Solution019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.replace('!', ' ');
        s = s.replace(',', ' ');
        s = s.replace('?', ' ');
        s = s.replace('.', ' ');
        s = s.replace('_', ' ');
        s = s.replace('\'', ' ');
        s = s.replace('@', ' ');
        s = s.replace("  ", " ");
        while (s.contains("  ")) {
            s = s.replace("  ", " ");
        }
        s = s.trim();
        if (s.length() > 0){
            String[] sParts = s.split(" ");
            System.out.println(sParts.length);
            for (String part : sParts) {
                System.out.println(part);
            }
        } else {
            System.out.println(0);
        }

        // Write your code here.
        scan.close();
    }
}