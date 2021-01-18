package week12.d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodsPackerTest {

    @Test
    void packGoodsTest() {
        assertEquals(1815, new GoodsPacker().packGoods(new int[][]{{6, 600}, {4, 397}, {2, 15}}, 20));
        }
    }
