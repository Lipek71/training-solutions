package inheritancemethods.bankaccount;

public class DebitAccount {
    private String accountNumber;
    private long balance;
    static final double COST = 3.0;
    static final long MIN_COST = 200;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public final long costOfTransaction(long amount) {
        return amount * COST / 100 >= MIN_COST ? (long) (amount * COST / 100) : MIN_COST;
    }

    public boolean transaction(long amount) {
        boolean transactionSuccess = amount + costOfTransaction(amount) <= balance;
        if (transactionSuccess) {
            balance -= amount + costOfTransaction(amount);
        }
        return transactionSuccess;
    }

    public void balanceToZero() {
        balance = 0;
    }
}
