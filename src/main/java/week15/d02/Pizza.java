package week15.d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Pizza {

    private List<Order> orderList = new ArrayList<>();

    public void loadFromFile() {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(this.getClass().getResourceAsStream("/orders.txt"), StandardCharsets.UTF_8)))
        {
            String line ="";
            LocalDate date = null;
            while ((line = br.readLine()) != null) {
                if (line.length() == 10) {
                    date = LocalDate.parse(line, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
                }else {
                    String[] lineParts = br.readLine().split(" ");
                    String address = lineParts[0] + " "+lineParts[1] + " "+lineParts[2];
                    LocalTime time = LocalTime.parse(lineParts[3]);
                    orderList.add(new Order(date,time,line,address));
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("cannot read file");
        }
    }

    public LocalDate findWorstDay() {

        TreeMap<LocalDate,Integer> ordersByDate =
                orderList.stream().collect(Collectors.toMap(Order::getDate,m->1,Integer::sum,TreeMap::new));

        LocalDate worstDate = ordersByDate.firstKey();
        for (LocalDate date : ordersByDate.keySet()) {
            if (ordersByDate.get(date) < ordersByDate.get(worstDate)) {
                worstDate = date;
            }
        }
        return worstDate;
    }

    public Optional<Order> findOrder(LocalDate date, LocalTime time) {
        return orderList.stream().filter(m -> m.getDate().equals(date) && m.getTime().equals(time)).findFirst();
    }

    public TreeMap<String, Integer> getStatisticByDriver() {
        return orderList.stream().collect(Collectors.toMap(Order::getDriver,m->1,Integer::sum,TreeMap::new));
    }


    public String getMostPopularAddress() {
        TreeMap<String, Integer> orderByAddresses = getAddressMap();
        String mostPopularAddress = orderByAddresses.firstKey();
        for (String anAddress : orderByAddresses.keySet()) {
            if (orderByAddresses.get(anAddress) > orderByAddresses.get(mostPopularAddress)) {
                mostPopularAddress = anAddress;
            }
        }
        return mostPopularAddress;
    }


    private TreeMap<String, Integer> getAddressMap() {
        return orderList.stream().collect(Collectors.toMap(Order::getAddress, m->1, Integer::sum, TreeMap::new));
    }

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.loadFromFile();
        System.out.println(pizza.findWorstDay());
        System.out.println(pizza.getStatisticByDriver());
        System.out.println(pizza.findOrder(LocalDate.of(2020,12,1), LocalTime.of(12,30)));
        System.out.println(pizza.findOrder(LocalDate.of(2020,2,2), LocalTime.of(10,30)));
        System.out.println(pizza.getMostPopularAddress());
    }

}

