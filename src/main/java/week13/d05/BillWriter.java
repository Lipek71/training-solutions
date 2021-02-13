package week13.d05;

import java.util.List;

public class BillWriter {
    public String writeBills(List<BillItem> items, LineWriter lineWriter) {
        StringBuilder sb = new StringBuilder();
        for (BillItem billItem : items) {
            String line = lineWriter.writeLine(billItem);
            sb.append(line).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BillWriter billWriter = new BillWriter();
        List<BillItem> billItems = List.of(
                new BillItem("kenyér", 3, 10),
                new BillItem("tej", 5, 20)
        );
        String result = billWriter.writeBills(billItems, new SimpleLineWriter());
        System.out.println(result);
        System.out.println();

        result = billWriter.writeBills(billItems, new MultipleLineWriter());
        System.out.println(result);
        System.out.println();

        result = billWriter.writeBills(billItems, new MultipleLineWriterHeader());
        System.out.println(result);
        System.out.println();

        result = billWriter.writeBills(billItems, new LineWriter() {
            @Override
            public String writeLine(BillItem item) {
                return item.getName();
            }
        });
        System.out.println(result);
        System.out.println();

        result = billWriter.writeBills(billItems, item -> item.getName());
        System.out.println(result);
        System.out.println();

        result = billWriter.writeBills(billItems, item -> item.getName() + ", "
                                                + item.getUnitPrice() + " * "
                                                + item.getNumber() + " = "
                                                + item.getNumber() * item.getUnitPrice());
        System.out.println(result);
        System.out.println();
    }
}
