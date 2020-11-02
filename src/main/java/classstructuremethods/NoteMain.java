package classstructuremethods;

import java.util.Scanner;

public class NoteMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Note note1 = new Note();

        System.out.println("Kérem a jegyzetelő nevét:");
        note1.setName(scanner.nextLine());

        System.out.println("Kérem a jegyzet tárgyát:");
        note1.setTopic(scanner.nextLine());

        System.out.println("Kérem a jegyzetet:");
        note1.setText(scanner.nextLine());

        System.out.println("A jegyzet adatai: " + note1.getNoteText());
    }
}
