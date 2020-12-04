package week06.d05;

public class Bottle {
    private static BottleType type;
    private static int filledUntil;

    public Bottle(BottleType type) {
        this.type = type;
    }

    public static BottleType getType() {
        return type;
    }

    public static int getFilledUntil() {
        return filledUntil;
    }

    public static Bottle of(BottleType type) {
        return new Bottle(type);
    }

    public static void setFilledUntil(int filledUntil) {
        Bottle.filledUntil = filledUntil;
    }

    @Override
    public String toString() {
        return getType() + ", " + getFilledUntil();
    }

    public void fill(int fillAmount) {
        if (Bottle.getType().getMaximumAmount() >= Bottle.getFilledUntil() + fillAmount) {
            Bottle.setFilledUntil(Bottle.getFilledUntil() + fillAmount);
        } else {
            throw new IllegalArgumentException("Isn't enough space in bottle!");
        }
    }
}
