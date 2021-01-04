package week09.d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SantaClausTest {
 @Test
 public void getThroughChimneysTest(){
     Person person1 = new Person("Lipka László", 50);
     Person person2 = new Person("Lipka Gergő", 10);
     Person person3 = new Person("Lipka Botond", 13);
     Person person4 = new Person("Lipka Bogárka", 20);

     SantaClaus santaClaus = new SantaClaus(List.of(person1,person2,person3,person4));
     santaClaus.getThroughChimneys();
     assertNull(santaClaus.getPersonList().get(0).getPresent());
     assertNull(santaClaus.getPersonList().get(3).getPresent());
     assertNotNull(santaClaus.getPersonList().get(1).getPresent());
     assertNotNull(santaClaus.getPersonList().get(2).getPresent());
 }
}