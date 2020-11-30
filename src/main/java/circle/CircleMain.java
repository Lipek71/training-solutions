package circle;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diameter;
        System.out.println("Kérem az átmérőt: ");
        diameter = scanner.nextInt();
        scanner.nextLine();
        Circle circle = new Circle(diameter);
        System.out.println("Az átmérő: " + circle.getDiameter());
        System.out.println("Kerület: " + circle.perimeter());
        System.out.println("Terület: " + circle.area());

        System.out.println("Kérem az átmérőt: ");
        diameter = scanner.nextInt();
        scanner.nextLine();
        Circle circle2 = new Circle(diameter);
        System.out.println("Az átmérő: " + circle2.getDiameter());
        System.out.println("Kerület: " + circle2.perimeter());
        System.out.println("Terület: " + circle2.area());
    }
}
