package week08.d01;

import java.util.ArrayList;
import java.util.List;

public class Sultan {
    boolean[] doors = new boolean[100];

    public void days() {
        for (int i = 1; i <= 100; i++) {
            for (int j = i; j <= 100; j++)
                turn(i, j);
        }
    }

    private void turn(int i, int j) {
        if (j % i == 0) {
            doors[j - 1] = !doors[j - 1];
        }
    }

    public List<Integer> openDoors() {
        List<Integer> openDoorsNumber = new ArrayList<>();
        for (int i = 0; i < doors.length; i++) {
            if (doors[i]) {
                openDoorsNumber.add(i + 1);
            }
        }
        return openDoorsNumber;
    }

    public static void main(String[] args) {

    }
}
