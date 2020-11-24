package week05d02;

public class ChangeLetter {
    private static final String VOWELS = "aeiou";
    private static final String REPLACE_CHAR = "*";

    public String changeVowels(String str) {
        String strBack = "";
        strBack = str.toLowerCase().replace('a', '*');
        strBack = strBack.toLowerCase().replace('e', '*');
        strBack = strBack.toLowerCase().replace('i', '*');
        strBack = strBack.toLowerCase().replace('o', '*');
        strBack = strBack.toLowerCase().replace('u', '*');
        return strBack;
    }

    public String changeVowelsVer2(String str){
        Character[] vowels = new Character[] {'a','e','i','o','u'};
        final char REPLACE_CHAR = '*';
        String strBack = str;
        for(int i= 0; i < vowels.length; i++){
            strBack = strBack.toLowerCase().replace(vowels[i], REPLACE_CHAR);
        }
        return strBack;
    }

    public String changeVowelsOptimal(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String actualChar = str.substring(i, i + 1);
            if (VOWELS.contains(actualChar)) {
                builder.append(REPLACE_CHAR);
            } else {
                builder.append(actualChar);
            }
        }
        return builder.toString();
    }
}
