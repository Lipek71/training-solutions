package introcontrol;

public class IntroControl {
    public int subtractTenIfGreaterThanTen(int number) {
        if (number <= 10) {
            return number;
        } else {
            return number - 10;
        }
        //return number <= 10 ? number : number - 10;
    }

    public String greetingToJoe(String name) {
        if (name.equals("Joe")) {
            return "Hello Joe";
        } else {
            return "";
        }
        //return name.equals("Joe") ? "Hello Joe" : "";
    }

    public int calculateBonus(int sale) {
        if (sale >= 1000000) {
            return sale / 10;
        } else {
            return 0;
        }
        //return sale >= 1000000 ? sale/10 : 0
    }

    public int calculateConsumption(int prev, int next) {
        if (prev < next) {
            return next - prev;
        } else {
            return 10000 - prev + next;
        }
        //return prev < next ? next - prev : 10000 - prev + next;
    }

    public void printNumbers(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetween(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {
        if (b > a) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i >= b; --i) {
                System.out.println(i);
            }
        }
    }

    public void printOddNumbers(int max) {
        for (int i = 1; i <= max; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}