package staticattrmeth.bank;

import java.math.BigDecimal;

public class BankTransaction {
    static int numberOfTransaction;
    static long sumOfTransactions;
    static long currentMinValue;
    static long currentMaxValue;

    private long trxValue;


    public static void initTheDay() {
        currentMinValue = 0;
        currentMaxValue = 0;
        numberOfTransaction = 0;
        sumOfTransactions = 0;
    }

    public static BigDecimal averageOfTransaction() {
        if(numberOfTransaction == 0){
            throw new IllegalArgumentException("No transaction!");
        }
        return BigDecimal.valueOf(sumOfTransactions).divide(BigDecimal.valueOf(numberOfTransaction));
    }

    public static long getCurrentMinValue() {
        return currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return currentMaxValue;
    }

    public static BigDecimal getSumOfTrxs() {
        return BigDecimal.valueOf(sumOfTransactions);
    }

    public BankTransaction(long trxValue) {
        if (trxValue < 1 || trxValue > 10000000) {
            throw new IllegalArgumentException("Value too low, or too high!");
        }
        this.trxValue = trxValue;
        if (trxValue < currentMinValue || currentMinValue == 0) {
            currentMinValue = trxValue;
        }
        if (trxValue > currentMaxValue || currentMaxValue == 0) {
            currentMaxValue = trxValue;
        }
        numberOfTransaction++;
        sumOfTransactions += trxValue;
    }

    public long getTrxValue() {
        return trxValue;
    }
}
