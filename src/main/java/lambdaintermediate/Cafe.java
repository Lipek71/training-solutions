package lambdaintermediate;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cafe {
    private final List<CoffeeOrder> coffeeOrderList;

    public Cafe(List<CoffeeOrder> coffeeOrderList) {
        this.coffeeOrderList = coffeeOrderList;
    }

    public BigDecimal getTotalIncome(){
        return coffeeOrderList.stream()
                .flatMap(cOL -> cOL.getCoffeeList().stream())
                .map(gCL -> gCL.getPrice())
                .reduce(BigDecimal.ZERO, (a, b) -> a.add(b), (x, y) -> x.add(y)).setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getTotalIncome(LocalDate date){
        return coffeeOrderList.stream()
                .filter(cOL -> cOL.getDateTime().toLocalDate().equals(date))
                .flatMap(cOL -> cOL.getCoffeeList().stream())
                .map(gCL -> gCL.getPrice())
                .reduce(BigDecimal.ZERO, (a, b) -> a.add(b), (x, y) -> x.add(y)).setScale(2, RoundingMode.HALF_UP);
    }

    public long getNumberOfCoffee(CoffeeType type){
        return coffeeOrderList.stream()
                .flatMap(cOL -> cOL.getCoffeeList().stream())
                .filter(gCL -> gCL.getType().equals(type))
                .count();
    }

    public List<CoffeeOrder> getOrdersAfter(LocalDateTime from){
        return  coffeeOrderList.stream()
                .filter(cOL -> cOL.getDateTime().isAfter(from))
                .collect(Collectors.toList());
    }

    public List<CoffeeOrder>  getFirstFiveOrder(LocalDate date){
        return  coffeeOrderList.stream()
                .filter(cOL -> cOL.getDateTime().toLocalDate().equals(date))
                .sorted((cOL1, cOL2) -> cOL1.getDateTime().compareTo(cOL2.getDateTime()))
                .limit(5)
                .collect(Collectors.toList());
    }
}
