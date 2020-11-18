package algorithmsdecision.bankaccounts;

import java.util.Arrays;
import java.util.List;

public class BankAccountDecisionMaker {
    private List<BankAccount> accounts = Arrays.asList();

    public boolean containsBalanceGreaterThan(List<BankAccount> accounts, int balance){
        boolean containsBalanceGreaterThan = false;
        for(BankAccount item: accounts){
            if(item.getBalance() > balance){
                containsBalanceGreaterThan = true;
                return containsBalanceGreaterThan;
            }
        }
        return containsBalanceGreaterThan;
    }
}
