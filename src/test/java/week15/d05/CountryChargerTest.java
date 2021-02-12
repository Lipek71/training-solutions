package week15.d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountryChargerTest {

    @Test
    void countryReaderTest() {
        CountryCharger countryCharger = new CountryCharger();
        assertEquals(213, countryCharger.countryReader("src/main/java/week15/d05/data.csv").size());
    }

    @Test
    void getMostThreeCountriesTest() {
        CountryCharger countryCharger = new CountryCharger();
        countryCharger.countryReader("src/main/java/week15/d05/data.csv");
        assertEquals("[Country{name='Andorra', notification=10251, rate=0.134568176746262}\n" +
                ", Country{name='Gibraltar', notification=4187, rate=0.12422120690678218}\n" +
                ", Country{name='Montenegro', notification=65227, rate=0.1048358840339322}\n" +
                "]", countryCharger.getMostThreeCountries().toString());
    }
}