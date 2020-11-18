package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxAgeCalculatorTest {

    List<Trainer> trainers = Arrays.asList(
            new Trainer("Laci", 49),
            new Trainer("Kati", 35),
            new Trainer("Pali", 51),
            new Trainer("Csabi", 50)
    );

    @Test
    public void testMaxAgeCalculator() {
        MaxAgeCalculator maxAgeCalculator = new MaxAgeCalculator();
        assertEquals(51, maxAgeCalculator.trainerWithMaxAge(trainers).getAge());
    }

}
