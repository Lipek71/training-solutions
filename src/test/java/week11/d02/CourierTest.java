package week11.d02;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    @Test
    void fileReading() {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("rides.txt");
        Courier courier =new Courier();

        courier.fileReading(is);

        assertEquals(61, courier.getRides().size());
    }

    @Test
    void firstTask() {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("rides.txt");
        Courier courier =new Courier();

        courier.fileReading(is);
        Ride elvart = new Ride(1, 1, 3);
        assertEquals(elvart.toString(), courier.firstTask().toString());
    }

    @Test
    void holidays() {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("rides.txt");
        Courier courier =new Courier();

        courier.fileReading(is);

        assertEquals(2, courier.holidays().size());
        assertEquals(2, courier.holidays().get(0));
        assertEquals(6, courier.holidays().get(1));

    }

    @Test
    void distanceOfDays() {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("rides.txt");
        Courier courier =new Courier();

        courier.fileReading(is);

        assertEquals(65, courier.distanceOfDays()[0]);
        assertEquals(0, courier.distanceOfDays()[1]);
        assertEquals(69, courier.distanceOfDays()[2]);
        assertEquals(62, courier.distanceOfDays()[3]);
        assertEquals(74, courier.distanceOfDays()[4]);
        assertEquals(0, courier.distanceOfDays()[5]);
        assertEquals(75, courier.distanceOfDays()[6]);
    }
}