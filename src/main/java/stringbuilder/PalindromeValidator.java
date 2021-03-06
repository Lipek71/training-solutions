package stringbuilder;

public class PalindromeValidator {
    public boolean isPalindrome(String word) {
        if (word == null) {
            throw new IllegalArgumentException("Text must not be null!");
        }

        StringBuilder wordForward = new StringBuilder(word.toLowerCase().trim());
        return wordForward.toString().equals(wordForward.reverse().toString());
    }

    public static void main(String[] args) {
        PalindromeValidator palindromeValidator = new PalindromeValidator();
        System.out.println(palindromeValidator.isPalindrome("amma"));
    }
}
