package collectionslist.collectionsarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        List<Integer> winningNumbers;
        List<Integer> lotteryNumbers = new ArrayList<>();

        if (ballCount <= lotteryType) {
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }
        for (int i = 1; i <= ballCount; i++) {
            lotteryNumbers.add(i);
        }
        Collections.shuffle(lotteryNumbers);
        winningNumbers = lotteryNumbers.subList(0, lotteryType);

        return winningNumbers;
    }
}
