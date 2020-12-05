package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

    public void risePrice(int percent) {
        price = price + (percent * price) / 100;
    }

    public byte comparePricePerCapacity(Pendrive pendrive) {
        if ((double) getPrice() / (double) getCapacity() > (double) pendrive.getPrice() / (double) pendrive.getCapacity()) {
            return 1;
        } else if ((double) getPrice() / (double) getCapacity() == (double) pendrive.getPrice() / (double) pendrive.getCapacity()) {
            return 0;
        } else {
            return -1;
        }
    }

    public boolean cheaperThan(Pendrive pendrive) {
        return this.getPrice() < pendrive.getPrice();
    }
}
