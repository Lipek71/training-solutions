package week04;

import java.util.Random;
import java.util.Scanner;

public class NumberFinder {

    public static void main(String[] args) {
        Random rnd = new Random();
        int number=rnd.nextInt(100) +1;
        Scanner scanner = new Scanner(System.in);
        int numberFind=0;
        System.out.println(number);
        for(int i=0; i < 6; i++){
            System.out.println("Kérek egy számot: ");
            numberFind = scanner.nextInt();
            scanner.nextLine();
            if(number > numberFind){
                System.out.println("Nagyobbra gondoltam!");
            } else if(number < numberFind){
                System.out.println("Kisebbre gondoltam!");
            } else if(number == numberFind){
                System.out.println("Ügyes vagy kitaláltad!");
                break;
            }
        }
        if (number != numberFind){
            System.out.println("Sajnos nem találtad ki: " + number + " volt a szám");
        }

    }
}
