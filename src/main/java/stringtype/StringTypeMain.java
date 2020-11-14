package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message += +444;
        System.out.println(message);
        boolean b = message.equals("Hello John Doe");
        System.out.println(b);
        boolean c = message.equals("Hello John Doe444");
        System.out.println(c);
        String empty1 = "";
        String empty2 = "";
        String empty3 = empty1.concat(empty2);
        System.out.println(empty3.length());
        String work = "Abcde";
        System.out.println(work.length());
        System.out.println(work.substring(0,1)+","+work.substring(2,3));
        System.out.println(work.substring(0,3));
    }
}
