package lambdaprimitives;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class SportGadgetStore {
    private final List<Product> productList;

    public SportGadgetStore(List<Product> productList) {
        this.productList = productList;
    }

    public int getNumberOfProducts(){
        IntStream pieces = productList.stream().flatMapToInt(pL -> IntStream.of(pL.getPieces()));
        return pieces.sum();
    }

    public double getAveragePrice(){
        DoubleStream prices = productList.stream().flatMapToDouble(pL -> DoubleStream.of(pL.getPrice()));
        return prices.average().orElse(0.0);
    }

    public String getExpensiveProductStatistics(double minPrice){
        IntSummaryStatistics statistics = productList.stream().filter(pL -> pL.getPrice() >= minPrice).mapToInt(Product::getPieces).summaryStatistics();
        return  statistics.getCount() == 0 ? "Nincs ilyen termék." : "Összesen " + statistics.getCount() + " féle termék, amelyekből minimum " + statistics.getMin() + " db, maximum " + statistics.getMax() + " db, összesen " + statistics.getSum() + " db van.";
    }
}
