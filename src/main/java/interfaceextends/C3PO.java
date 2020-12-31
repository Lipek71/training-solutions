package interfaceextends;

import java.util.ArrayList;
import java.util.List;

public class C3PO implements MoveableRobot {
    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();

    public C3PO(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public void moveTo(Point position){
        this.position = position;
        path.add(this.position);
    }
    public void fastMoveTo(Point position){
        this.position = position;
        path.add(this.position);
    }
    public void rotate(int angle){
        this.angle = angle;
    }

    @Override
    public List<Point> getPath() {
        return path;
    }
}
