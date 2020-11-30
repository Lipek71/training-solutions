package controlselection.greetings;

public class Greetings {
    public String greet(int hour, int minute) {
        String greeting="";

        if (hour * 60 + minute >= 0) {
            greeting = "jó éjt";
        }
        if (hour * 60 + minute > 300) {
            greeting = "jó reggelt";
        }
        if (hour * 60 + minute > 540) {
            greeting = "jó napot";
        }
        if (hour * 60 + minute > 1110) {
            greeting = "jó estét";
        }
        if (hour * 60 + minute > 1200) {
            greeting = "jó éjt";
        }
        return greeting;
    }

    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        System.out.println(greetings.greet(5, 1));
    }
}
