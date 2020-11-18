package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> salespersons) {
        Salesperson salesPersonWithFurthestBelowTarget = null;
        for (Salesperson item : salespersons) {
            if (salesPersonWithFurthestBelowTarget == null || item.getDifferenceFromTarget() < 0 && item.getDifferenceFromTarget() < salesPersonWithFurthestBelowTarget.getDifferenceFromTarget()) {
                salesPersonWithFurthestBelowTarget = item;
            }
        }
        return salesPersonWithFurthestBelowTarget;
    }
}

