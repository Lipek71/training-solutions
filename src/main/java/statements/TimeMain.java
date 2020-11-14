package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        int hour, minute, second;
        Time time1, time2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az első idő óra részét:");
        hour = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem az első idő perc részét:");
        minute = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem az első idő másodperc részét:");
        second = scanner.nextInt();
        scanner.nextLine();
        time1 = new Time(hour, minute, second);

        System.out.println("Kérem az második idő óra részét:");
        hour = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem az második idő perc részét:");
        minute = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem az második idő másodperc részét:");
        second = scanner.nextInt();
        scanner.nextLine();
        time2 = new Time(hour, minute, second);

        System.out.println("Az első időpont: " + time1.toString() + " = " + time1.getInMinutes());
        System.out.println("Az második időpont: " + time2.toString() + " = " + time2.getInSecond());
        System.out.println("Az első korábbi, mint a második:" + time1.earlierThan(time2));
    }
}
