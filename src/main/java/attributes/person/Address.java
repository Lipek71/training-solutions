package attributes.person;

import java.util.Scanner;

public class Address {
    private String country;
    private String city;
    private String streetAndNumber;
    private String zipCode;

    public Address(String country, String city, String streetAndNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String addresToString(){
        return country + " " + city + " " + streetAndNumber + " " + zipCode;
    }

    public void correctData(){
        Scanner scanner = new Scanner(System.in);
        String newCountry;
        String newCity;
        String newStreetAndNumber;
        String newZipCode;
        System.out.println("Az ország: " + getCountry() + ". Kérem az új országot: ");
        newCountry = scanner.nextLine();
        country = newCountry;
        System.out.println("A város: " + getCity() + ". Kérem az új várost: ");
        newCity = scanner.nextLine();
        city = newCity;
        System.out.println("Az utca: " + getStreetAndNumber() + ". Kérem az új utcát: ");
        newStreetAndNumber = scanner.nextLine();
        streetAndNumber = newStreetAndNumber;
        System.out.println("Az irányítószám: " + getZipCode() + ". Kérem az új irányítószámot: ");
        newZipCode = scanner.nextLine();
        zipCode = newZipCode;
    }
}
