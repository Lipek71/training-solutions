package week11.d04;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameLengthTest {

    @Test
    void getLengthsTest1() {
        NameLength nameLength = new NameLength();

        assertEquals("[3, 4]", nameLength.getLengths(List.of("Joe", "Jack", "Jane", "Jake", "George", "William")).toString());
    }

    @Test
    void getLengthsTest2() {
        NameLength nameLength = new NameLength();

        assertEquals("[3, 4, 5, 8, 6]", nameLength.getLengths(List.of("Joe", "Jack", "Jane", "Jake", "George", "William" ,"Janus", "Jonathan", "Jill", "Judith")).toString());
    }

    @Test
    void getLengthsTest3() {
        NameLength nameLength = new NameLength();

        assertEquals("[3, 4, 5, 6, 8]", nameLength.getLengths2(List.of("Joe", "Jack", "Jane", "Jake", "George", "William" ,"Janus", "Jonathan", "Jill", "Judith")).toString());
    }
}