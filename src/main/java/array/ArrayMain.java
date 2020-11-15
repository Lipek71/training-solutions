package array;

import static java.lang.StrictMath.pow;

public class ArrayMain {
    public static void main(String[] args) {
        String[] dayOfWeeks = new String[7];
        String[] getDayOfWeeks = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};

        System.out.println(getDayOfWeeks[1]);
        System.out.println(getDayOfWeeks.length);

        int[] exponentOfTwo = new int[5];

        for (int i = 0; i < 5; i++) {
            exponentOfTwo[i] = (int) pow(2, i);
        }
        for (int number : exponentOfTwo) {
            System.out.println(number);
        }

        boolean[] booleans = new boolean[6];

        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                booleans[i] = false;
            } else {
                booleans[i] = true;
            }
        }

        for (boolean item : booleans) {
            System.out.println(item);
        }
    }
}
