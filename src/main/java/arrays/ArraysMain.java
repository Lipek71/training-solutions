package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {
    String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    List<String> daysOfWeek() {
        List<String> daysOfWeek = Arrays.asList("hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap");
        return daysOfWeek;
    }

    String multiplicationTableAsString(int size) {
        int[][] multiplicator = new int[size][size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                multiplicator[i - 1][j - 1] = i * j;
            }
        }
        return Arrays.deepToString(multiplicator);
    }

    boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    boolean wonLottery(int[] ownNumber, int[] winNumber) {
        int[] ownNumber1 = Arrays.copyOf(ownNumber,ownNumber.length);
        int[] winNumber1 = Arrays.copyOf(winNumber,winNumber.length);
        Arrays.sort(ownNumber1);
        Arrays.sort(winNumber1);
        return Arrays.equals(ownNumber1, winNumber1);
    }

    int min(double[] day1, double[] day2){
        if(day1.length < day2.length ){
            return day1.length;
        }else
        {
            return day2.length;
        }
    }

    boolean sameTempValuesDaylight(double[] day, double[] anotherDay){
        double[] day1;
        double[] anotherDay1;
        int min;
        ArraysMain arraysMain = new ArraysMain();
        min=arraysMain.min(day, anotherDay);
        day1 = Arrays.copyOfRange(day,0,min);
        anotherDay1 = Arrays.copyOfRange(anotherDay,0,min);
        return Arrays.equals(day1, anotherDay1);
    }

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();
        System.out.println(arraysMain.numberOfDaysAsString());
        System.out.println();
        System.out.println(arraysMain.daysOfWeek());
        System.out.println();
        System.out.println(arraysMain.multiplicationTableAsString(5));
        System.out.println();
        double[] firstDay = {3.5, 4.5};
        double[] secondDay = {3.5, 4.5};
        double[] thirdDay = {4.5, 4.5};
        System.out.println(arraysMain.sameTempValues(firstDay, secondDay));
        System.out.println(arraysMain.sameTempValues(firstDay, thirdDay));
        System.out.println();
        int[] ownNumber = {1, 23, 71, 45, 90};
        int[] winNumber = {23, 45, 90, 1, 71};
        int[] winNumber2 = {23, 46, 90, 1, 71};
        System.out.println(arraysMain.wonLottery(ownNumber, winNumber));
        System.out.println(arraysMain.wonLottery(ownNumber, winNumber2));
        System.out.println(Arrays.toString(ownNumber));
        System.out.println();
        double[] fourthDay = {3.5, 4.5, 5.5};
        double[] fifthDay = {3.5, 4.5, 5.5, 6.5};
        System.out.println(arraysMain.sameTempValuesDaylight(fourthDay, fifthDay));

    }


}
