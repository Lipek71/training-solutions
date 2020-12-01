package week06.d02;

public class ProductSum {
    private int frozen;
    private int dairy;
    private int bakedgoods;
    private int other;

    public ProductSum(int frozen, int dairy, int bakedgoods, int other) {
        this.frozen = frozen;
        this.dairy = dairy;
        this.bakedgoods = bakedgoods;
        this.other = other;
    }

    public int getFrozen() {
        return frozen;
    }

    public int getDairy() {
        return dairy;
    }

    public int getBakedgoods() {
        return bakedgoods;
    }

    public int getOther() {
        return other;
    }
}
