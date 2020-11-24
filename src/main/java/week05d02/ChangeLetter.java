package week05d02;

public class ChangeLetter {
    public String changeVowels(String str){
        String strBack ="";
        strBack = str.toLowerCase().replace('a','*');
        strBack = strBack.toLowerCase().replace('e','*');
        strBack = strBack.toLowerCase().replace('i','*');
        strBack = strBack.toLowerCase().replace('o','*');
        strBack = strBack.toLowerCase().replace('u','*');
        return strBack;
    }
}
