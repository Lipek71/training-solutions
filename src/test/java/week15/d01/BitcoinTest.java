package week15.d01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitcoinTest {

    @BeforeEach

    @Test
    void readFileMapTest() {
        Bitcoin bitcoin = new Bitcoin();
        bitcoin.readFileMap("/bitcoin.txt");
        assertEquals(29, bitcoin.getExchangeMap().size());
    }

    @Test
    void bitcoinBestBuyingMapTest() {
        Bitcoin bitcoin = new Bitcoin();
        bitcoin.readFileMap("/bitcoin.txt");
        assertEquals("A(z) 4. napon érdemes vásárolni, a(z) 27. napon érdemes eladni!", bitcoin.bitcoinBestBuyingMap(bitcoin.getExchangeMap()).toString());
    }
}