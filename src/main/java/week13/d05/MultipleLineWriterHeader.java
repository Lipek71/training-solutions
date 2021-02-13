package week13.d05;

public class MultipleLineWriterHeader implements LineWriter {

    @Override
    public String writeLine(BillItem item) {
        return String.format("%20s %5d * %5d = %6d", item.getName(), item.getUnitPrice(), item.getNumber(),
                item.getNumber() * item.getUnitPrice());
    }
}
