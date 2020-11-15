package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        PrimitiveTypes binaryNumber = new PrimitiveTypes();
        System.out.println(binaryNumber.toBinaryString(255));
        int x = 5;
        int y = 2;
        int z = x++ + (x - 4) * y - 2;
        System.out.println(x + " " + z);
    }
}
