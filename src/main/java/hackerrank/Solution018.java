package hackerrank;

import java.util.Scanner;

public class Solution018 {

    static boolean isAnagram(String a, String b) {
        char aOrder[] = a.toLowerCase().toCharArray();
        java.util.Arrays.sort(aOrder);
        String aOrdered =  new String(aOrder).trim();
        char bOrder[] = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(bOrder);
        String bOrdered =  new String(bOrder).trim();

        return aOrdered.equals(bOrdered);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}