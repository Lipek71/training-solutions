package week10.d01;

public class Elevations {
    private int up;
    private int down;

    public Elevations(int up, int down) {
        this.up = up;
        this.down = down;
    }

    public int getUp() {
        return up;
    }

    public int getDown() {
        return down;
    }

    @Override
    public String toString() {
        return "Elevations{" +
                "up=" + up +
                ", down=" + down +
                '}';
    }
}
