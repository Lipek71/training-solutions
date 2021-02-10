package week13.d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNameTownTest {

    @Test
    void getFirstNameTown() {
        FirstNameTown firstNameTown = new FirstNameTown();
        assertEquals("Aba", firstNameTown.getFirstNameTown());
    }
}