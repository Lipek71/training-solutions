package week12.d05;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmployeeFilterTest {

    Employee e1= new Employee(50,5,"Laci", Arrays.asList("plan", "programming"));
    Employee e2= new Employee(33,1,"Jani", Arrays.asList("plan", "programming"));
    Employee e3= new Employee(24,3,"Feri", Arrays.asList("plan", "programming"));
    Employee e4= new Employee(26,1,"Teri", Arrays.asList("plan",  "programming"));
    Employee e5= new Employee(40,6,"Imi", Arrays.asList("plan", "C++"));
    Employee e6= new Employee(40,2,"Évi", Arrays.asList("plan", "Phyton"));


    @Test
    public void testEmployeeFilter() {

        EmployeeFilter employeeFilter = new EmployeeFilter();
        assertEquals(Arrays.asList(e1,e3), employeeFilter.countSeniorDevs(Arrays.asList(e1,e2,e3,e4,e5,e6)));

    }

    @Test
    public void testErrMessage() {

        EmployeeFilter ef = new EmployeeFilter();

        Exception e = Assertions.assertThrows(IllegalArgumentException.class,() -> ef.countSeniorDevs(Arrays.asList(e1, e2, null)));
        assertEquals(e.getMessage(),"List is null or empty");

        e = Assertions.assertThrows(IllegalArgumentException.class,() -> ef.countSeniorDevs(new ArrayList<>()));
        assertEquals(e.getMessage(),"List is null or empty");

        e = Assertions.assertThrows(IllegalArgumentException.class,() -> ef.countSeniorDevs(null));
        assertEquals(e.getMessage(),"List is null or empty");
    }
}