package algorithmsdecision.bankaccounts;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class TransactionDecisionMaker {

    public boolean containsCreditEntryGreaterThan(List<Transaction> transactions, LocalDateTime startTime, LocalDateTime endTime, int balance){
        boolean containsCreditEntryGreaterThan = false;
        for(int i=0; i < transactions.size(); i++){
            if(transactions.get(i).isDebit() &&
                    transactions.get(i).getDateOfTransaction().isAfter(startTime) &&
                    transactions.get(i).getDateOfTransaction().isBefore(endTime) &&
                    transactions.get(i).getAmount() > balance){
                containsCreditEntryGreaterThan = true;
            }
        }
        return containsCreditEntryGreaterThan;
    }


}
