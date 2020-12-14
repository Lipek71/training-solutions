package abstractclass.gamecharacter;

import java.util.Random;

public class Point {
    private long x;
    private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long distance(Point point){
        return(long)(Math.sqrt((getX() - point.getX())*(getX() - point.getX()) +(getY() - point.getY())*(getY() - point.getY())));
    }
}
