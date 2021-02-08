package lambdacollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cafe {
    private List<CoffeeOrder> coffeeOrderList = new ArrayList<>();

    public Cafe(List<CoffeeOrder> coffeeOrderList) {
        this.coffeeOrderList = coffeeOrderList;
    }

    public List<CoffeeOrder> getCoffeeOrderList() {
        return coffeeOrderList;
    }

    public void cafeAdd(CoffeeOrder coffeeOrder){
        this.coffeeOrderList.add(coffeeOrder);
    }

    public Map<CoffeeType, Long > getCountByCoffeeType(){
        return coffeeOrderList.stream().flatMap(cOL -> cOL.getCoffeeList().stream()).collect(Collectors.groupingBy(
                (Coffee cOL) -> cOL.getType(),
                Collectors.counting()
        ));
        /*List<List<Coffee>> coffeeList = new ArrayList<>();
        for (CoffeeOrder coffeeOrder: this.coffeeOrderList){
            coffeeList.add(coffeeOrder.getCoffeeList());
        }
        List<String> coffees = new ArrayList<>();
        for (List<Coffee> coffees1 : coffeeList){
            for (Coffee coffee: coffees1){
                coffees.add(String.valueOf(coffee.getType()));
            }
        }
        Map<CoffeeType, Long> coffeeTypeLongMap = coffees.stream().collect(Collectors.toMap(
                String,
                v -> 1L,
                (v1, v2) -> Long.valueOf(Math.toIntExact(v1 + v2))
        ));
        return coffeeTypeLongMap;*/
    }

    public double getAverageOrder(){

        return coffeeOrderList.stream().collect(Collectors.averagingDouble(cOL -> cOL.getCoffeeList().size()));
    }
}
