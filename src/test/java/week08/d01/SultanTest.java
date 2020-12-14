package week08.d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SultanTest {

    @Test
    public void SultanTest100(){
        Sultan sultan = new Sultan();
        sultan.days();
        assertEquals("[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]", sultan.openDoors().toString());
    }

}