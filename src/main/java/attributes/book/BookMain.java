package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Veszélyes vizeken");
        System.out.println(book.getTitle());
        book.setTitle("A három kismalac");
        System.out.println(book.getTitle());
    }
}
