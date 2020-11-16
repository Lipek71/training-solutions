package attributes.person;

import java.sql.SQLOutput;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("Lipka László", "LL1971");
        Address address1 = new Address("Magyarország", "Velence", "Csongor u. 8/A", "2481");
        person1.moveTo(address1);
        Person person2 = new Person("Mismás Zsuzsanna", "MZS1973");
        Address address2 = new Address("Magyarország", "Dunaharaszti", "Szőlőhegy u. 55/A", "2330");
        person2.moveTo(address2);

        System.out.println(person1.personToString());
        System.out.println(person1.getAddress());
        System.out.println(address1);
        System.out.println(address1.addresToString());

        System.out.println(person2.personToString());
        System.out.println(person2.getAddress());
        System.out.println(address2);
        System.out.println(address2.addresToString());

        person2.correctData();
        address2.correctData();

        System.out.println(person2.personToString());
        System.out.println(person2.getAddress());
        System.out.println(address2);
        System.out.println(address2.addresToString());


    }
}
