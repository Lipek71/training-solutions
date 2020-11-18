package algorithmsdecision.bankaccounts;

import java.time.LocalDateTime;

public class Transaction {
    private String accountNumber;
    private TransactionOperation transactionOperation;
    private int amount;
    private LocalDateTime dateOfTransaction;
    private TransactionStatus status=TransactionStatus.CREATED;

    public Transaction(String accountNumber, TransactionOperation transactionOperation, int amount, LocalDateTime dateTime) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
        this.dateOfTransaction = dateTime;
    }

    public boolean isCredit(){
        if(transactionOperation == TransactionOperation.CREDIT){
            return true;
        } else {
            return false;
        }
    }

    public boolean isDebit(){
        if(transactionOperation == TransactionOperation.DEBIT){
            return true;
        } else {
            return false;
        }
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getDateOfTransaction() {
        return dateOfTransaction;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setExecutedSuccessfully(){
        status = TransactionStatus.SUCCEEDED;
    }

    public void setNotExecutedSuccessfully(){
        status = TransactionStatus.PENDING;
    }

}
