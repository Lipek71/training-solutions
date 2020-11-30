package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person1 = new Person("Laci", 49);
        Person person2 = new Person("Zsuzsi", 47);

        Person person3 = new Person("Zotya", 46);

        person1 = person3;
        person2 = person1;

        person2.setName("Zoltán");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());

        int int1;
        int int2;

        int1 = 24;
        int2 = int1;
        int2++;

        System.out.println(int1 + ", " + int2);
    }
}
