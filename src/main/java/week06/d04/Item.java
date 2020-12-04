package week06.d04;

public class Item {
    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Name is null or empty!");
        }
        if(quantity < 1){
            throw new IllegalArgumentException("Quantity invalid!");
        }
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ", " + quantity;
    }
}
