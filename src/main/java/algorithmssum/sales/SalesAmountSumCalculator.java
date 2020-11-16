package algorithmssum.sales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesAmountSumCalculator {
    List<Salesperson> salespersons = Arrays.asList();

    public int sumSalesAmount(List<Salesperson> salespersons){
        int sum = 0;
        for(Salesperson item: salespersons){
            sum += item.getAmount();
        }
        return sum;
    }
}
