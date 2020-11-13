package classstructureintegrate;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        String owner;
        String bankAccount;
        int openBalance;
        int changeBalance;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az első bankszámla tulajdonosát: ");
        owner = scanner.nextLine();
        System.out.println("Kérem az első bankszámlaszámot: ");
        bankAccount = scanner.nextLine();
        System.out.println("Kérem az első számla egyenlegét: ");
        openBalance = scanner.nextInt();
        scanner.nextLine();

        BankAccount bankAccount1 = new BankAccount(bankAccount, owner, openBalance);

        System.out.println("Kérem a második bankszámla tulajdonosát: ");
        owner = scanner.nextLine();
        System.out.println("Kérem a második bankszámlaszámot: ");
        bankAccount = scanner.nextLine();
        System.out.println("Kérem a második számla egyenlegét: ");
        openBalance = scanner.nextInt();
        scanner.nextLine();

        BankAccount bankAccount2 = new BankAccount(bankAccount, owner, openBalance);

        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());

        System.out.println("Mennyi a befizetés az első számlán: ");
        changeBalance = scanner.nextInt();
        scanner.nextLine();
        bankAccount1.deposit(changeBalance);
        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());

        System.out.println("Mennyi a kifizetés a második számlán: ");
        changeBalance = scanner.nextInt();
        scanner.nextLine();
        bankAccount2.withdraw(changeBalance);
        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());

        System.out.println("Mennyi a kifizetés az első számlán: ");
        changeBalance = scanner.nextInt();
        scanner.nextLine();
        bankAccount1.withdraw(changeBalance);
        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());

        System.out.println("Mennyi a befizetés a második számlán: ");
        changeBalance = scanner.nextInt();
        scanner.nextLine();
        bankAccount2.deposit(changeBalance);
        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());

        System.out.println("Mennyi az átvezetés az első számláról a másodikra: ");
        changeBalance = scanner.nextInt();
        scanner.nextLine();
        bankAccount1.transfer(bankAccount2,changeBalance);
        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());

    }
}
