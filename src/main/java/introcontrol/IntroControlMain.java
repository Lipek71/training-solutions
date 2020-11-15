package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println(introControl.subtractTenIfGreaterThanTen(8));
        System.out.println(introControl.subtractTenIfGreaterThanTen(25));

        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe(""));

        System.out.println(introControl.calculateBonus(600000));
        System.out.println(introControl.calculateBonus(1500000));

        System.out.println(introControl.calculateConsumption(6000, 8500));
        System.out.println(introControl.calculateConsumption(7000, 3000));

        introControl.printNumbers(35);

        introControl.printNumbersBetween(25,40);

        introControl.printNumbersBetweenAnyDirection(10, 15);
        introControl.printNumbersBetweenAnyDirection(20, 10);

        introControl.printOddNumbers(13);
    }
}
