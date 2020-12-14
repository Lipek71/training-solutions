package inheritancemethods.bankaccount;

public class CreditAccount extends DebitAccount{
    private long overdraftLimit;

    public CreditAccount(String accountNumber, long balance, long overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public long getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public boolean transaction(long amount) {
        boolean transactionSuccess =   amount + costOfTransaction(amount) <= getBalance() + overdraftLimit;
        if (transactionSuccess){
            setBalance(getBalance() - amount - super.costOfTransaction(amount));
        }
        if (getBalance() < 0){
            overdraftLimit += getBalance();
            super.balanceToZero();
        }
        return transactionSuccess;
    }
}
