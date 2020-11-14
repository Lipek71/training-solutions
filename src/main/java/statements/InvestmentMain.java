package statements;

import statements.Investment;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Investment investment;
        Scanner scanner = new Scanner(System.in);
        int fund;
        int interestRate;
        int days;
        System.out.println("Kérem az alap összegét: ");
        fund = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem a kamatlábat: ");
        interestRate = scanner.nextInt();
        investment = new Investment(fund, interestRate);
        investment.setActive(true);

        System.out.println("Kérem a napok számát a hozam kiszámításához: ");
        days = scanner.nextInt();
        scanner.nextLine();
        System.out.println("A hozam " + days + " napra: " + investment.getYield(days));
        System.out.println("Kérem a napok számát az alap lezárásához: ");
        days = scanner.nextInt();
        scanner.nextLine();
        System.out.println("A befektetés összege " + days + " nap után: " + investment.close(days));
        System.out.println("Kérem a napok számát az alap lezárásához: ");
        days = scanner.nextInt();
        scanner.nextLine();
        System.out.println("A befektetés összege " + days + " nap után: " + investment.close(days));
    }
}
