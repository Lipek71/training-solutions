package algorithmscount.letters;

public class LetterCounter {

    public int countLetters(String letters, char letter) {
        int count = 0;
        for (int i = 0; i < letters.length(); i++) {
            if ( letters.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }
}
