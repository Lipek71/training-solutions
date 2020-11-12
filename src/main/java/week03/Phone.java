package week03;

public class Phone {
    String prefix;
    String number;

    public Phone(String prefix, String number) {
        this.prefix = prefix;
        this.number = number;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "prefix='" + prefix + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
