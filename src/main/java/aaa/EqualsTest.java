package aaa;

import org.junit.jupiter.api.Test;

public class EqualsTest {
    @Test
    public void testEquals(){
        String s = "John";
        String s2 = "John";
        System.out.println(s == s2);
        s2 = "Jane";
        System.out.println(s == s2);
        System.out.println(s + ", " + s2);
    }
}
