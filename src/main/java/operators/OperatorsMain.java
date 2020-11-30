package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();
        System.out.println(operators.isEven(10));
        System.out.println(operators.isEven(11));

        System.out.println(Integer.toBinaryString(16));
        System.out.println(Integer.toBinaryString(16 << 1));
        System.out.println(Integer.toBinaryString(16 >> 1));

        System.out.println(Integer.toBinaryString(13));
        System.out.println(Integer.toBinaryString(13 << 1));
        System.out.println(Integer.toBinaryString(13 >> 1));

        System.out.println();
        System.out.println(operators.multiplyByPowerOfTwo(2,1));
        System.out.println(operators.multiplyByPowerOfTwo(2,2));
        System.out.println(operators.multiplyByPowerOfTwo(2,4));

        System.out.println();
        int i = -1;
        String s = Integer.toBinaryString(i);
        System.out.println(s);
        //int j = Integer.parseInt(s, 2);
        //System.out.println(j);  //Szerintem azért, mert visszafele csak stringet kap és túl nagy a szám.

        System.out.println(0333); //A bevezető 0 azt jelenti, hogy nyolcas számrendszerben adunk meg utána számot 64*3 + 8˙*3 + 1*3 = 219.

    }
}
