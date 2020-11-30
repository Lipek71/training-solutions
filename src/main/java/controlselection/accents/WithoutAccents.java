package controlselection.accents;

import java.lang.reflect.Array;

public class WithoutAccents {
    char[][] VOWELS = new char[][]{{'a', 'a'}, {'á', 'a'}, {'e', 'e'}, {'é', 'e'}, {'i', 'i'}, {'í', 'i'}, {'o', 'o'}, {'ó', 'o'}, {'ö', 'o'}, {'ő', 'o'}, {'u', 'u'}, {'ú', 'u'}, {'ü', 'u'}, {'ű', 'u'},
            {'A', 'A'}, {'Á', 'A'}, {'E', 'E'}, {'É', 'E'}, {'I', 'I'}, {'Í', 'I'}, {'O', 'O'}, {'Ó', 'O'}, {'Ö', 'O'}, {'Ő', 'O'}, {'U', 'U'}, {'Ú', 'U'}, {'Ü', 'U'}, {'Ű', 'U'},};

    public char convertToCharWithoutAccents(char charIn) {
        char charOut = charIn;
        for (int i = 0; i < 28; i++) {
            if (VOWELS[i][0] == charIn) {
                charOut = VOWELS[i][1];
            }
        }
        return charOut;
    }
}
