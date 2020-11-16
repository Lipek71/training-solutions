package attributes.bill;

public class BillMain {
    public static void main(String[] args) {
        Item item1 = new Item("Ceruza", "10", 50.0);
        Item item2 = new Item("Toll", "5", 500.0);
        Item item3 = new Item("Radír", "2", 100.0);
        Item item4 = new Item("Papír", "100", 5.0);

        Bill bill = new Bill();
        bill.addItem(item1);
        bill.addItem(item2);
        bill.addItem(item3);
        bill.addItem(item4);

        System.out.println(bill.calculateTotalPrice());


    }
}
