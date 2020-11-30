package typeconversion.whichtype;

public enum Type {
    BYTE(Byte.MIN_VALUE, Byte.MAX_VALUE),
    SHORT(Short.MIN_VALUE, Short.MAX_VALUE),
    INT(Integer.MIN_VALUE, Integer.MAX_VALUE);

    private final int min;
    private final int max;

    Type(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
