package lambdaintermediate;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cafe {
    private final List<CoffeeOrder> coffeeOrderList;

    public Cafe(List<CoffeeOrder> coffeeOrderList) {
        this.coffeeOrderList = coffeeOrderList;
    }

    public long getTotalIncome(){

        return 123;
    }

    public long getTotalIncome(LocalDate date){

        return 124;
    }

    public int getNumberOfCoffee(CoffeeType type){

        return 125;
    }

    public List<CoffeeOrder> getOrdersAfter(LocalDateTime from){
        List<CoffeeOrder> ordersAfter = new ArrayList<>();

        return ordersAfter;
    }

    public List<CoffeeOrder>  getFirstFiveOrder(LocalDate date){
        List<CoffeeOrder> firstFiveCoffeeType = new ArrayList<>();

        return firstFiveCoffeeType;
    }
}
