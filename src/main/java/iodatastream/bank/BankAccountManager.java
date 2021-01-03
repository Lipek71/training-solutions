package iodatastream.bank;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class BankAccountManager {
    public void saveAccount(BankAccount bankAccount, Path filePath){
        String accountNumber = bankAccount.getAccountNumber();
        String owner = bankAccount.getOwner();
        double balance = bankAccount.getBalance();
        Path file = filePath.resolve(accountNumber + ".dat");
        System.out.println(file.toString() + " LL");
        try(DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(file)))){
            dataOutputStream.writeUTF(accountNumber);
            dataOutputStream.writeUTF(owner);
            dataOutputStream.writeDouble(balance);
        } catch (IOException ioe){
            throw new IllegalStateException("Can't write the file!", ioe);
        }
    }

    public BankAccount loadAccount(InputStream inputStream){
        try(DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream))){
            return new BankAccount(dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readDouble());
        } catch (IOException ioe){
            throw new IllegalStateException("Can't read the file!", ioe);
        }
    }


}
