package week02;

import java.util.Scanner;

public class InputNames {
    public static void main(String[] args) {

        String [] names = new String [5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <  names.length; i++) {

            int j = i + 1;
            System.out.println("Kérem a " + j + ". nevet:");
            names[i] = scanner.nextLine();
        }

        for (int i = 0; i <  names.length; i++) {

            int j = i + 1;
            System.out.println("Az " + j + ". név: " + names[i]);
        }

    }
}
