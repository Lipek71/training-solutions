package exeptionclass.bank;

import static exeptionclass.bank.ErrorCode.INVALID_AMOUNT;
import static exeptionclass.bank.ErrorCode.LOW_BALANCE;

public class Account {
    private String accountNumber;
    private double balance;
    private double maxSubtract = 100000;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        if (maxSubtract < 0) {
            throw new InvalidBankOperationException("", INVALID_AMOUNT);
        }
        this.maxSubtract = maxSubtract;
    }

    public double subtract(double number) {
        if (number < 0) {
            throw new InvalidBankOperationException("", INVALID_AMOUNT);
        }
        if (balance - number < 0) {
            throw new InvalidBankOperationException("", LOW_BALANCE);
        }
        this.balance -= number;
        return balance;
    }

    public double deposit(double number) {
        if (number < 0) {
            throw new InvalidBankOperationException("", INVALID_AMOUNT);
        }
        this.balance += number;
        return balance;
    }
}
