package exeptionclass.bank2;

public class InvalidAccountNumberBankOperationException extends  InvalidBankOperationException{
    public InvalidAccountNumberBankOperationException(String message) {
        super(message, ErrorCode.INVALID_ACCOUNTNUMBER);
    }
}