package collectionslist.collectionslinkedlist;

import java.util.*;

public class Draw {
    public List<Integer> createNumberPool(int maxNumber) {
        List<Integer> lotteryNumbers = new LinkedList<>();

        for (int i = 1; i <= maxNumber; i++) {
            lotteryNumbers.add(i);
        }
        Collections.shuffle(lotteryNumbers);
        System.out.println("Create " + lotteryNumbers);

        return lotteryNumbers;
    }

    public Set<Integer> drawNumbers(int drawCount, int maxNumber) {
        if (drawCount >= maxNumber) {
            throw new IllegalArgumentException("drawCount must be less then " + maxNumber + "!");
        }
        System.out.println("Draw " + (new TreeSet<>(createNumberPool(maxNumber))));
        return new TreeSet<>(createNumberPool(maxNumber));
    }
}
