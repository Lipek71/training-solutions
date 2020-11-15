package introcontrol;

import java.util.Scanner;

public class BootRental {
    public static void main(String[] args) {
        int persons;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hányan akarnak csónakot bérelni: ");
        persons = scanner.nextByte();
        scanner.nextLine();
        if(persons == 1 || persons == 2){
            System.out.println("Elvitték a kétszemélyes csónakot, még nyolcan mehetnek utánuk.");
        }else if(persons == 3){
            System.out.println("Elvitték a háromszemélyes csónakot, még heten mehetnek utánuk.");
        }else if(persons == 4 || persons ==5){
            System.out.println("Elvitték az ötszemélyes csónakot, még öten mehetnek utánuk.");
        }else if(persons == 6 || persons == 7){
            System.out.println("Elvitték a kétszemélyes és ötszemélyes csónakot, még hárman mehetnek utánuk.");
        }else if(persons == 8){
            System.out.println("Elvitték a háromszemélyes és ötszemélyes csónakot, még ketten mehetnek utánuk.");
        }else if(persons == 9 || persons == 10){
            System.out.println("Elvitték az összes csónakot.");
        }else{
            System.out.println("Elvitték az összes csónakot " + (persons - 10) + " ember maradt a parton.");
        }
    }
}
