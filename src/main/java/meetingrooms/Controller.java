package meetingrooms;

import java.util.Scanner;

public class Controller {
    public static Office office = new Office();

    public static void readOffice() {
        String name;
        int length;
        int width;
        int roomsPieces = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg, hogy hány darab tárgyalót szeretne rögzíteni: ");
        roomsPieces = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= roomsPieces; i++) {
            System.out.println("Kérem a: " + i + ". tárgyaló adatait:");
            System.out.println("Kérem a tárgyaló nevét: ");
            name = scanner.nextLine();
            System.out.println("Kérem a tárgyaló hosszát méterben: ");
            length = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kérem a tárgyaló szélességét méterben: ");
            width = scanner.nextInt();
            scanner.nextLine();
            office.addMeetingRoom(new MeetingRoom(name, length, width));
        }

    }

    public static byte printMenu() {
        byte printNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a végrhajtandó feladat számát:");
        System.out.println("1. Tárgyalók sorrendben");
        System.out.println("2. Tárgyalók visszafele sorrendben");
        System.out.println("3. Minden második tárgyaló");
        System.out.println("4. Területek");
        System.out.println("5. Keresés pontos név alapján");
        System.out.println("6. Keresés névtöredék alapján");
        System.out.println("7. Keresés terület alapján");
        System.out.println("8. Kilépés a programból");
        return printNumber = scanner.nextByte();
    }

    public static void runMenu(byte printNumber) {
        Scanner scanner = new Scanner(System.in);
        switch (printNumber) {
            case 1:
                System.out.println("Tárgyalók sorrendben:");
                Office.printNames();
                break;
            case 2:
                System.out.println("Tárgyalók visszafele sorrendben:");
                Office.printNamesReverse();
                break;
            case 3:
                System.out.println("Minden második tárgyaló:");
                Office.printEventNames();
                break;
            case 4:
                System.out.println("Területek:");
                Office.printAreas();
                break;
            case 5:
                String name;
                System.out.println("Keresés pontos név alapján:");
                System.out.println("Kérem a tárgyaló nevét:");
                name = scanner.nextLine();
                Office.printMeetingRoomsWithName(name);
                break;
            case 6:
                String nameContains;
                System.out.println("Keresés névrészlet alapján:");
                System.out.println("Kérem a tárgyaló névrészletét:");
                nameContains = scanner.nextLine();
                Office.printMeetingRoomsContains(nameContains);
                break;
            case 7:
                int area;
                System.out.println("Keresés terület alapján:");
                System.out.println("Kérem a minimális területet: ");
                area = scanner.nextInt();
                scanner.nextLine();
                Office.printAreasLargeThan(area);
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        byte printNumber;
        Controller controller = new Controller();
        controller.readOffice();
        System.out.println();
        do {
            printNumber = controller.printMenu();

            controller.runMenu(printNumber);
        } while (printNumber != 8);
    }
}
