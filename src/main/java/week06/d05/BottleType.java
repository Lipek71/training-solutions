package week06.d05;

public enum BottleType {
    GLASS_BOTTLE (720),
    PET_BOTTLE(1250);

    private final int maximumAmount;

    BottleType(int maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public int getMaximumAmount() {
        return maximumAmount;
    }
}
