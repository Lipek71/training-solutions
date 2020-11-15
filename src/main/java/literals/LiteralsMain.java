package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        double quotient;
        long big;
        String s;
        String word;
        int i = 1;
        int j = -2;
        System.out.println("" + 1 + 2);
        quotient = 3d / 4;
        System.out.println(quotient);
        big = 3_244_444_444L;
        System.out.println(big);
        s = "árvíztűrőtükörfúrógép";
        System.out.println(s);
        word = "title".toUpperCase();
        System.out.println(word);
        System.out.println(Integer.toString(i, 2));
        System.out.println(Integer.toString(j, 2));
    }
}
