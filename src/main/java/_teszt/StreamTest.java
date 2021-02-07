package _teszt;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class StreamTest {

    List<Employee> employees = Arrays.asList(
            new Employee("John Doe"),
            new Employee("Jane Doe"),
            new Employee("Joe Doe"),
            new Employee("John Smith")
    );

    @Test
    public void testCount() {
        assertEquals(0L, Stream.empty().count());

        assertEquals(2L, Stream.of(new Employee("John Doe"), new Employee("Jack Doe")).count());

        Stream<Employee> s = Stream.of(new Employee("John Doe"), new Employee("Jack Doe"));
        assertEquals(2,s.count());

        assertEquals(4L, employees.size());
    }

    @Test
    public void testMin(){
        Employee employee = employees.stream().min(Comparator.comparing(Employee::getName)).get();
        System.out.println(employee.getName());
        assertEquals("Jane Doe", employee.getName());
    }

    @Test
    public void testFindFirst(){
        //Employee employee = employees.stream().findFirst().orElseThrow(() - new IllegalArgumentException());
        Employee employee = employees.stream().findFirst().get();
        assertEquals("John Doe", employee.getName());
    }

    @Test
    public void testAllMatch() {
        assertTrue(employees.stream().allMatch(e -> e.getName().length() > 5));
        assertFalse(employees.stream().allMatch(e -> e.getName().startsWith("a")));
    }

    @Test
    public void testForEach() {
        employees.stream().forEach(System.out::println);
        employees.stream().forEach(e->e.setName(e.getName().toUpperCase()));
        assertEquals("JOE DOE", employees.get(2).getName());
    }

    @Test
    public void infiniteTest(){
        Stream.generate(Math::random).limit(5000).forEach(System.out::println);
    }
}
