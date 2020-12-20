package week08.d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountryStatisticsTest {

    @Test
    public void testMaxPopulation(){
        CountryStatistics countryStatistics = new CountryStatistics();
        countryStatistics.readCountries();
        assertEquals("Kongoi_Demokratikus_Koztarsasag 79 3 9",countryStatistics.maxPopulation(countryStatistics.countries));
    }

}