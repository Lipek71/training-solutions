package hackerrank;

import java.util.*;
import java.io.*;

class Solution006 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int count = 0; count < n; count++) {
                int outNumber = a;
                for (int countInside = 0; countInside < count + 1; countInside++){
                    outNumber += (int)(Math.pow(2, countInside) * b);
                }
                System.out.print(outNumber + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
