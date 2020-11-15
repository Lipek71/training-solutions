package arrayofarrays;

import java.time.LocalDate;
import java.time.YearMonth;

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

    void printArrayOfArrays(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

    int[][] triangularMatrix(int size) {
        int[][] triangularMatrix = new int[size][];
        for (int i = 0; i < size; i++) {
            triangularMatrix[i] = new int[i + 1];
        }
        int i = 0;
        int j = 0;
        for (i = 0; i < size; i++) {
            for (j = 0; j < i + 1; j++) {
                triangularMatrix[i][j] = i;
                System.out.print(triangularMatrix[i][j] + " ");
            }
            System.out.println();
        }
        return triangularMatrix;
    }

    int[][] getValues() {
        int[][] dayOfMonths = new int[12][];
        dayOfMonths[0] = new int[31];
        dayOfMonths[1] = new int[28];
        dayOfMonths[2] = new int[31];
        dayOfMonths[3] = new int[30];
        dayOfMonths[4] = new int[31];
        dayOfMonths[5] = new int[30];
        dayOfMonths[6] = new int[31];
        dayOfMonths[7] = new int[31];
        dayOfMonths[8] = new int[30];
        dayOfMonths[9] = new int[31];
        dayOfMonths[10] = new int[30];
        dayOfMonths[11] = new int[31];
        return dayOfMonths;
    }

    void BonusprintArrayOfArrays(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] < 10) {
                    System.out.print("__" + a[i][j] + "_");
                } else if (a[i][j] < 100 && a[i][j] >= 10) {
                    System.out.print("_" + a[i][j] + "_");
                } else {
                    System.out.print(a[i][j] + "_");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        ArrayOfArraysMain arrayOfArraysMain = new ArrayOfArraysMain();
        int size = 0;
        int[][] multi1;
        int[][] triangle;
        size = 13;
        multi1 = arrayOfArraysMain.multiplicationTable(size);
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(multi1[i - 1][j - 1] + " ");
            }
            System.out.println();
        }
        System.out.println();
        arrayOfArraysMain.printArrayOfArrays(multi1);

        System.out.println();
        triangle = arrayOfArraysMain.triangularMatrix(size);

        System.out.println();
        arrayOfArraysMain.BonusprintArrayOfArrays(multi1);
    }
}

