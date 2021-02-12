package week15.d05;

public class Country {
    private String name;
    private int notification;
    private double rate;

    public Country(String name, int notification, double rate) {
        this.name = name;
        this.notification = notification;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNotification() {
        return notification;
    }

    public void setNotification(int notification) {
        this.notification = notification;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", notification=" + notification +
                ", rate=" + rate +
                '}' + "\n";
    }
}
