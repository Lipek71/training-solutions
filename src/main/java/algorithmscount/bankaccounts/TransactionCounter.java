package algorithmscount.bankaccounts;

import java.util.Arrays;
import java.util.List;

public class TransactionCounter {
    List<Transaction> transactions = Arrays.asList();

    public int countEntryLessThan(List<Transaction> transactions, int limit){
        int count=0;
        for(Transaction item: transactions){
            if(item.getAmount() < limit){
                count++;
            }
        }
        return count;
    }
}
