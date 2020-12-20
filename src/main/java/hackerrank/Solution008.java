package hackerrank;

import java.util.*;

public class Solution008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        String str;
        while(scanner.hasNext()){
            str = scanner.nextLine();
            System.out.println(count + " " + str);
            count++;
        }
    }
}