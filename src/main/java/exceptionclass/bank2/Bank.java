package exceptionclass.bank2;

import java.util.List;

public class Bank {
    List<Account> accounts;

    public Bank(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("");
        }
        this.accounts = accounts;
    }

    public void payment(String accountnumber, double number) {
        int count = -1;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber().equals(accountnumber)) {
                count = i;
            }
        }
        if (count == -1) {
            throw new InvalidAccountNumberBankOperationException("");
        }
        accounts.get(count).subtract(number);
    }

    public void deposit(String accountnumber, double number) {
        int count = -1;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber().equals(accountnumber)) {
                count = i;
            }
        }
        if (count == -1) {
            throw new InvalidAccountNumberBankOperationException("");
        }
        accounts.get(count).deposit(number);
    }

}
