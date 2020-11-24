package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {
    @Test
    public void changeVowelsTest() {
        ChangeLetter changeLetter = new ChangeLetter();
        assertEquals("l*l", changeLetter.changeVowels("lol"));
    }

    @Test
    public void changeVowelsTest2() {
        ChangeLetter changeLetter = new ChangeLetter();
        assertEquals("l*l*l*l*l*l", changeLetter.changeVowels("lalelilolul"));
    }

    @Test
    public void changeVowelsTest3() {
        assertEquals("*rv*zt*r*f*r*g*p", new ChangeLetter().changeVowelsVer2("arvizturofurogep"));
    }

    @Test
    public void changeVowelsTest4() {
        assertEquals("*rv*zt*r*f*r*g*p", new ChangeLetter().changeVowelsOptimal("arvizturofurogep"));
    }

}
