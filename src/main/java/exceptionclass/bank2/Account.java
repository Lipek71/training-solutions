package exceptionclass.bank2;

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
            throw new InvalidAmountBankOperationException("");
        }
        this.maxSubtract = maxSubtract;
    }

    public double subtract(double number) {
        if (number < 0) {
            throw new InvalidAmountBankOperationException("");
        }
        if (balance - number < 0) {
            throw new LowBalanceBankOperationException("");
        }
        this.balance -= number;
        return balance;
    }

    public double deposit(double number) {
        if (number < 0) {
            throw new InvalidAmountBankOperationException("");
        }
        this.balance += number;
        return balance;
    }
}
