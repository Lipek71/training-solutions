package week13.d05;

import java.util.ArrayList;
import java.util.List;

public class BillWriterSajat {
    public String writeBills(List<BillItem> billItems, String format) {
        //String formatted = String.format("Name: %s, year of birth: %d", employee.getName(), employee.getYearOfBirth());
        String output = "";
        for (BillItem billItem : billItems) {
            //, billItem.getName(), billItem.getUnitPrice(), billItem.getNumber(), billItem.getUnitPrice()* billItem.getNumber()
            output += String.format(format, billItem.getNumber(), billItem.getName(), billItem.getUnitPrice());
            output += "\n";
        }
        return output;
    }

    public static void main(String[] args) {
        BillItem billItem1 = new BillItem("kifli", 5, 15 );
        BillItem billItem2 = new BillItem("tejföl", 2, 150 );
        BillItem billItem3 = new BillItem("sportszelet", 4, 80 );

        List<BillItem> billItems = new ArrayList<>();
        billItems.add(billItem1);
        billItems.add(billItem2);
        billItems.add(billItem3);

        BillWriterSajat billWriter = new BillWriterSajat();
        System.out.println(billWriter.writeBills(billItems, "%d %s, darabja %d Ft"));
        System.out.println(billWriter.writeBills(billItems, "Megnevezés (20 karakter) Egységár (Ft) Darab Összeg \n %25d %-20s %d"));
    }
}
