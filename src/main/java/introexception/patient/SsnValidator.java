package introexception.patient;

public class SsnValidator {
    public boolean isValidSsn(String ssn){
        int ssnSum=0;
        boolean ssnValid = false;
        if (ssn.length() == 9){
            for(int i = 0; i < 9; i++){
                if(i+1 % 2 == 0){
                    ssnSum += Integer.parseInt(ssn.substring(i, i+1))*3;
                } else {
                    ssnSum += Integer.parseInt(ssn.substring(i, i+1))*7;
                }
            }
            if(ssnSum % 10 == Integer.parseInt(ssn.substring(8))){
                ssnValid = true;
            }
        }
        return ssnValid;
    }
}
