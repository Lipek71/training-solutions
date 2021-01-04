package week09.d03;

import java.util.ArrayList;
import java.util.List;

public class SantaClaus {
    private List<Person> personList;

    public SantaClaus(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return new ArrayList<>(personList);
    }

    public void getThroughChimneys() {
        for (Person person : personList){
            if(person.getAge() < 14){
                person.setPresent();
            }
        }
    }
}
