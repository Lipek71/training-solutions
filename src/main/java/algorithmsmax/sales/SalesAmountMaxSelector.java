package algorithmsmax.sales;

import java.util.List;

public class SalesAmountMaxSelector {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespersons) {
        Salesperson salesPersonWithMaxSalesAmount = null;
        for (Salesperson item : salespersons) {
            if (salesPersonWithMaxSalesAmount == null || item.getAmount() > salesPersonWithMaxSalesAmount.getAmount()){
                salesPersonWithMaxSalesAmount = item;
            }
        }
        return salesPersonWithMaxSalesAmount;
    }
}
