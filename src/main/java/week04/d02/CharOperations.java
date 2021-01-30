package week04.d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharOperations {
    List<Integer> chars = Arrays.asList();


    public List<Integer> charFinder(String string, char ch) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(i);
            if (string.charAt(i) == ch) {
                //chars.add(i,i);
                System.out.println(i);
            }
        }
        return chars;
    }

    public boolean isValidNumber(String number) {
        try {
            int value = Integer.parseInt(number);
            if (value < 0 && value > 10) {
                return true;
            }
            return false;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static void main(String[] args) {
        CharOperations charOperations = new CharOperations();
        charOperations.charFinder("alma", 'a');



    }
}

