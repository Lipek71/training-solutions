package week06.d05;

public class Bottle {
    private BottleType type;
    private int filledUntil;

    public Bottle(BottleType type) {
        this.type = type;
    }

    public  BottleType getType() {
        return type;
    }

    public  int getFilledUntil() {
        return filledUntil;
    }

    public static Bottle of(BottleType type) {
        return new Bottle(type);
    }

    @Override
    public String toString() {
        return getType() + ", " + getFilledUntil();
    }

    public void fill(int fillAmount) {
        if (type.getMaximumAmount() >= filledUntil+ fillAmount) {
            filledUntil += fillAmount;
        } else {
            throw new IllegalArgumentException("Isn't enough space in bottle!");
        }
    }
}
