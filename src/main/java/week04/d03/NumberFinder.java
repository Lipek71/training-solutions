package week04.d03;

import java.util.Random;
import java.util.Scanner;

public class NumberFinder {

    public static void main(String[] args) {
        Random rnd = new Random();
        int number=rnd.nextInt(100) +1;
        Scanner scanner = new Scanner(System.in);
        int numberFind=0;
        System.out.println(number);
        for(int i=1; i < 7; i++){
            System.out.println("Kérek egy számot: ");
            numberFind = scanner.nextInt();
            scanner.nextLine();
            if(number > numberFind){
                System.out.println("Nagyobbra gondoltam! " + i + ". probálkozás volt.");
            } else if(number < numberFind){
                System.out.println("Kisebbre gondoltam! " + i + ". probálkozás volt.");
            } else if(number == numberFind){
                System.out.println("Ügyes vagy kitaláltad! " + i + ". probálkozás volt.");
                break;
            }
        }
        if (number != numberFind){
            System.out.println("Sajnos nem találtad ki: " + number + " volt a szám");
        }

    }
}
