package lambdacollectors;

import lambdaintermediate.Coffee;
import lambdaintermediate.CoffeeOrder;
import lambdaintermediate.CoffeeType;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cafe {
    private final List<CoffeeOrder> coffeeOrderList;

    public Cafe(List<CoffeeOrder> coffeeOrderList) {
        this.coffeeOrderList = coffeeOrderList;
    }

    public Map<CoffeeType, Long > getCountByCoffeeType(){
        return coffeeOrderList.stream().flatMap(cOL -> cOL.getCoffeeList().stream()).collect(Collectors.groupingBy(
                Coffee::getType,
                Collectors.counting()
        ));
    }

    public double getAverageOrder(){

        return coffeeOrderList.stream().collect(Collectors.averagingDouble(cOL -> cOL.getCoffeeList().size()));
    }
}
