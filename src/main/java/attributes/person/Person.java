package attributes.person;

import java.util.Scanner;

public class Person {
    private String name;
    private String identificationCard;
    private Address address;

    public Person(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public String getName() {
        return name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public Address getAddress() {
        return address;
    }

    public String personToString(){
        return name + " " + identificationCard;
    }

    public void correctData(){
        Scanner scanner = new Scanner(System.in);
        String newName;
        String newIdentificationCard;
        System.out.println("A név: " + getName() + ". Kérem az új nevet: ");
        newName = scanner.nextLine();
        name = newName;
        System.out.println("A kártya: " + getIdentificationCard() + ". Kérem az új kártyát: ");
        newIdentificationCard = scanner.nextLine();
        identificationCard = newIdentificationCard;
    }

    public void moveTo(Address address){
        this.address = address;
    }

}
