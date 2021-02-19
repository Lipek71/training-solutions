package week16.d01;

import java.util.ArrayList;

public class Concatenator {

    public static String convert(int a, int b) {
        return Integer.toString(a) + Integer.toString(b);
    }

    public static void main(String[] args) {
        System.out.println(Concatenator.convert(5, 6));
        System.out.println(convert(5, 6));
        System.out.println(new Concatenator().convert(5, 6));

    }
}
