package week03.d04;

public class PhoneParse {
    public static Phone parse(String number){
        String prefix ="";
        String number1="";
        int i = 0;
        do{
            if(number.substring(i, i+1) != "-" && i < 2) {
                prefix = prefix + number.substring(i, i+1);
            }
            if(number.substring(i,i+1) != "-" && i > 2){
                number1 = number1 + number.substring(i, i+1);
            }
            i++;
        } while(i<number.length());
        Phone phone = new Phone(prefix,number1);
        return phone;
    }

    public static void main(String[] args) {

        System.out.println(PhoneParse.parse("30-12345678"));
    }
}
