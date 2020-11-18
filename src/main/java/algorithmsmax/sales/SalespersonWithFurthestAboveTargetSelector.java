package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespersons) {
        Salesperson salespersonWithFurthestAboveTarget = null;
        for (Salesperson item : salespersons) {
            if(salespersonWithFurthestAboveTarget == null || item.getDifferenceFromTarget() > 0 && item.getDifferenceFromTarget() > salespersonWithFurthestAboveTarget.getDifferenceFromTarget() )
            salespersonWithFurthestAboveTarget = item;
        }
        return salespersonWithFurthestAboveTarget;
    }
}

