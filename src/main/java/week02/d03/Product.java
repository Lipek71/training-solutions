package week02.d03;

public class Product {

    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product p) {
        return name.equals(p.getName());
    }

    public boolean areTheyEqual2(Product p) {
        boolean nameEquals;
        boolean codeEquals;
        nameEquals = name.equals(p.getName());
        codeEquals = Math.abs(code.length() - p.getCode().length()) <= 1;
        return nameEquals && codeEquals;
    }

    public static void main(String[] args) {

        Product product1 = new Product("Asztal", "101010");
        Product product2 = new Product("Asztal", "10101");
        Product product3 = new Product("Szék", "10101010");

        System.out.println(product1.areTheyEqual(product2));
        System.out.println(product2.areTheyEqual(product3));

        System.out.println(product1.areTheyEqual2(product2));
        System.out.println(product2.areTheyEqual2(product3));

    }

}
