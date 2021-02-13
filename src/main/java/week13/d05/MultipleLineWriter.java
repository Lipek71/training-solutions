package week13.d05;

public class MultipleLineWriter implements LineWriter {

    @Override
    public String writeLine(BillItem item) {
        return String.format("%13s %5d * %d = %6d", item.getName(), item.getNumber(), item.getUnitPrice(),
                item.getNumber() * item.getUnitPrice());
    }
}
