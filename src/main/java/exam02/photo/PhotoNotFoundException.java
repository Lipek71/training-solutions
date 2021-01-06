package exam02.photo;

import exeptionclass.bank.ErrorCode;

public class PhotoNotFoundException extends RuntimeException{

    public PhotoNotFoundException(String message){
        super(message);
    }

}
