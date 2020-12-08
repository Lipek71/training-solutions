package week07.d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserImplTest {

    @Test
    public void UserImpl(){
        assertEquals("László Lipka", new UserImpl("lipek71", "László", "Lipka").getFullName());
    }
}