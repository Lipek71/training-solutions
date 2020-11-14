package statements;

public class StatementMain {

    public static void main(String[] args) {

        var x = 5 +6;

        var y = 11 - x;

        int z = 8;

        boolean b = x > y;

        boolean c = b || z > 5;

        z++;

        System.out.println("x: " + x + " y: " + y + " z: " + z + " b: " + b + " c: " + c);

        System.out.println("z: " + z);

    }
}
