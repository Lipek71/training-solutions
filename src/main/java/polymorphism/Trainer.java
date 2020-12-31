package polymorphism;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Trainer extends Human {

    private List<Course> courses;

    public Trainer(String name, List<Course> courses) {
        super(name);
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Tréner: " + getName() + " Kurzus: " + courses;
    }

    public static void main(String[] args) {
        System.out.println("Statikus típus: Trainer - Dinamikus típus: Trainer");
        Trainer trainer = new Trainer("John Doe", Arrays.asList(new Course("Kurzus1"), new Course("Kurzus2") ));
        Human human = trainer;
        Object object = trainer;
        HasName hasName = trainer;
        System.out.println(trainer.toString());
        System.out.println(human.toString());
        System.out.println(object.toString());
        System.out.println(hasName.toString());

        System.out.println("Statikus típus: Human - Dinamikus típus: Trainer");
        Human trainer2 = new Trainer("John Doe", Arrays.asList(new Course("Kurzus1"), new Course("Kurzus2") ));
        Human human2 = trainer2;
        Object object2 = trainer2;
        HasName hasName2 = trainer2;
        System.out.println(trainer2.toString());
        System.out.println(human2.toString());
        System.out.println(object2.toString());
        System.out.println(hasName2.toString());

        System.out.println("Statikus típus: Human - Dinamikus típus: Trainer");
        Object trainer3 = new Trainer("John Doe", Arrays.asList(new Course("Kurzus1"), new Course("Kurzus2") ));
        //Human human3 = trainer3;
        Object object3 = trainer3;
        //HasName hasName3 = trainer3;
        System.out.println(trainer3.toString());
        //System.out.println(human3.toString());
        System.out.println(object3.toString());
        //System.out.println(hasName3.toString());

    }
}