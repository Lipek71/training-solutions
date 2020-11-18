package algorithmsdecision.bankaccounts;

public class BankAccount {
    private String nameOfOwner;
    private String accountNumber;
    private int balance;

    public BankAccount(String nameOfOwner, String accountNumber, int balance) {
        this.nameOfOwner = nameOfOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public boolean deposit(int deposit){
        balance += deposit;
        return true;
    }

    public boolean withdraw(int withdraw){
        if(balance - withdraw < 0){
            return false;
        } else {
            balance -= withdraw;
            return true;
        }
    }


}
