package controlselection.consonant;

public class ToConsonant {
    public char convertToConsonant(char charIn){
        final String VOWELS= "aeiou";
        if(VOWELS.contains(String.valueOf(charIn).toLowerCase())){
            return (char)(charIn +1);
        } else {
            return charIn;
        }
    }
}
