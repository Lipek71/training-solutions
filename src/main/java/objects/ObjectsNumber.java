package objects;

public class ObjectsNumber {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println("book1: " + book1);
        Book book2 = new Book();
        System.out.println("book2: " + book2);
        Book book3 = new Book();
        System.out.println("book3: " + book3);
        Book book4 = book1;
        System.out.println("book4: " + book4);
        Book book5 = book1;
        System.out.println("book5: " + book5);
        Book book6 = book3;
        System.out.println("book6: " + book6);
        Book book7 = null;
        System.out.println("book7: " + book7);
        book4 = book5;
        System.out.println("book4: " + book4);
        book5 = new Book();
        System.out.println("book5: " + book5);
        book6 = null;
        System.out.println("book6: " + book6);

        // 4 objektum a heapen

        System.out.println("book1: " + book1);
        System.out.println("book2: " + book2);
        System.out.println("book3: " + book3);
        System.out.println("book4: " + book4);
        System.out.println("book5: " + book5);
        System.out.println("book6: " + book6);
        System.out.println("book7: " + book7);

        //öt néven négy objektum elérhető
    }
}
