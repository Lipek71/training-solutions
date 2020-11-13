package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Rejtő Jenő", "Vissza a pokolba");
        Book book2 = new Book("Rogers Cadenhead", "Tanuljuk meg a Java programozási nyelvet 24 óra alatt");
        Book book3 = new Book("Matt Ridley", "A józan optimista");

        book1.register("1235678K23");
        book2.register("4567334H67");
        book3.register("5686433T65");

        System.out.println("Könyv 1 szerző: " + book1.getAuthor() + " cím: " + book1.getTitle() + " ;regisztrációs szám: " + book1.getRegNumber());
        System.out.println("Könyv 2 szerző: " + book2.getAuthor() + " cím: " + book2.getTitle() + " ;regisztrációs szám: " + book2.getRegNumber());
        System.out.println("Könyv 3 szerző: " + book3.getAuthor() + " cím: " + book3.getTitle() + " ;regisztrációs szám: " + book3.getRegNumber());
    }

}
