package arrayofarrays;

import java.util.Arrays;

public class ArrayOfArraysMain {
    int[][] multiplicationTable(int size) {
        int[][] multiplicator = new int[size][size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                multiplicator[i - 1][j - 1] = i * j;
            }
        }
        return multiplicator;
    }

    public static void main(String[] args) {
        ArrayOfArraysMain arrayOfArraysMain = new ArrayOfArraysMain();
        int size = 0;
        int[][] multi1 = new int[size][size];
        size = 20;
        multi1 = arrayOfArraysMain.multiplicationTable(size);
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(multi1[i - 1][j - 1] + " ");
            }
            System.out.println();
        }
    }
}

