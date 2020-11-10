package week03;

import java.util.ArrayList;
import java.util.List;

public class PositionMain {
    public static void main(String[] args) {
        List<Position> positions = new ArrayList<>();
        positions.add(new Position("CEO", 200000));
        positions.add(new Position("employee", 500));
        positions.add(new Position("manager", 50000));

        for(Position position: positions){
            if(position.getBonus() > 150000){
                System.out.println(position.toString());
            }
        }
    }
}
