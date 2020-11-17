package algorithmscount.bankaccounts;

import java.util.Arrays;
import java.util.List;

public class BankAccountConditionCounter {
    List<BankAccount> bankAccounts = Arrays.asList();

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int limit) {
        int count = 0;
        for (BankAccount item : bankAccounts) {
            if (item.getBalance() > limit) {
                count++;
            }
        }
        return count;
    }
}
