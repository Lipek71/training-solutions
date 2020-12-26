package ioreadstring.transaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<BankAccount> accountList = new ArrayList<>();

    public List<BankAccount> getAccountList() {
        return accountList;
    }

    public void uploadListFromFile(String file) {
        Path filePath = Path.of(file);
        try {
            List<String> fileLines = Files.readAllLines(filePath);
            for (String str : fileLines) {
                String lineParts[] = str.split(";");
                accountList.add(new BankAccount(lineParts[0], lineParts[1], Integer.parseInt(lineParts[2])));
            }

        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can't open the file!", ioe);
        }
    }

    public void makeTransactions(String file) {
        Path filePath = Path.of(file);
        try {
            List<String> fileLines = Files.readAllLines(filePath);
            for (String str : fileLines) {
                String lineParts[] = str.split(";");
                for (BankAccount bankAccount : accountList){
                    if(bankAccount.getAccountNumber().equals(lineParts[0])){
                        bankAccount.setBalance(Integer.parseInt(lineParts[1]));
                    }
                }
            }

        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can't open the file!", ioe);
        }    }

    public static void main(String[] args) {
        TransactionManager tm = new TransactionManager();
        System.out.println(tm.getAccountList().size());
        tm.uploadListFromFile("src/test/resources/accounts.txt");
        System.out.println(tm.getAccountList().size());
    }
}
