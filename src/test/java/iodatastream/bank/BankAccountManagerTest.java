package iodatastream.bank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankAccountManagerTest {

    @TempDir
    public File folder;

    @Test
    public void testSaveAccount() throws IOException {
        BankAccount account = new BankAccount("10092395-77541845-00000000", "John Doe", 11234.6);

        BankAccountManager manager = new BankAccountManager();

        System.out.println(folder.toString());
        File file = new File(folder, "test.txt");
        System.out.println(file.toString());
        Path path=folder.toPath();
        manager.saveAccount(account, path);

        Path targetPath = path.resolve("10092395-77541845-00000000.dat");
        System.out.println(targetPath.toString() + " target");
        System.out.println(account.toString());
        byte[] savedAccount = Files.readAllBytes(targetPath);
        byte[] originalAccount = Files.readAllBytes(targetPath);

        assertArrayEquals(originalAccount, savedAccount);

    }
    @Test
    public void testLoadAccount() throws IOException {
        BankAccountManager manager = new BankAccountManager();
        Path file = Path.of("d:/training/training-solutions/src/main/resources/iodatastream/bank/10092395-77541845-00000000.dat");
        try (InputStream is = Files.newInputStream(file)){
            BankAccount account = manager.loadAccount(is);

            assertEquals("10092395-77541845-00000000", account.getAccountNumber());
            System.out.println(account.getAccountNumber());
            assertEquals("John Doe", account.getOwner());
            System.out.println(account.getOwner());
            assertEquals(11234.6, account.getBalance(), 0.0001);
            System.out.println(account.getBalance());
        }
    }
}