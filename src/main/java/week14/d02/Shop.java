package week14.d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Shop {

    public static final String TRANSACTION_SEPARATOR = ":";
    public static final String CUSTOMER_SEPARATOR = "-";
    public static final String ITEM_SEPARATOR = ",";
    public static final String PRICE_START = "\\(";
    private final List<Customer> customers = new ArrayList<>();


    public void readFromFile() {
        InputStream is = Customer.class.getResourceAsStream("/shoptransactions.txt"); //this.getClass().getResourceAsStream("/shoptransactions.txt");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                procLine(line);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file");
        }
    }

    private void procLine(String line) {
        String[] strings = line.split(TRANSACTION_SEPARATOR);

        String[] custStrings = strings[0].split(CUSTOMER_SEPARATOR);

        String[] itemStrings = strings[1].trim().split(ITEM_SEPARATOR);

        createCustomerList(custStrings[0], custStrings[1], itemStrings);
    }

    private void createCustomerList(String name, String transId, String[] itemStrings) {
        Customer customer = new Customer(name);
        customers.add(customer);
        List<Item> items = new ArrayList<>();
        for (String item : itemStrings) {
            String[] itemParts = item.split(PRICE_START);
            items.add(new Item(itemParts[0], Integer.parseInt(itemParts[1].substring(0, itemParts[1].length() - 1))));
        }
        customer.addTransaction(transId, items);
    }

    public int getTransactionsValue(String key) {
        int sum = 0;
        for (Customer customer : customers) {
            if (customer.getTransactions().containsKey(key)) {
                for (Item item : customer.getTransactions().get(key)) {
                    sum += item.getItemPrice();
                }
                return sum;
            }
        }
        throw new IllegalArgumentException("No such id");
    }

    public int getCustomerSpentSum(String customerId) {
        int sum = 0;
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                sum = getSum(sum, customer);
            }
        }
        return sum;
    }

    private int getSum(int sum, Customer customer) {
        for (List<Item> items : customer.getTransactions().values()) {
            for (Item item : items) {
                sum += item.getItemPrice();
            }
        }
        return sum;
    }

    public List<Item> getSortedItemsOfTransactions(String custId, String key) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(custId)) {
                List<Item> items = getItems(key, customer);
                if (items != null) return items;
            }
        }
        throw new IllegalArgumentException("Customer not found");
    }

    private List<Item> getItems(String key, Customer customer) {
        List<Item> items = customer.getTransactions().get(key);
        if (customer.getTransactions().containsKey(key)) {
            items.sort(Comparator.comparing(o -> o.getItemName().toLowerCase()));
            return items;
        }
        return items;
    }

    public int getGoodsPiece(String goods) {
        int count = 0;
        for (Customer customer : customers) {
            for (Map.Entry<String, List<Item>> listEntry : customer.getTransactions().entrySet()) {
                for (Item item : listEntry.getValue())
                    if (item.getItemName().equals(goods)) {
                        count++;
                    }
            }
        }
        if (count!=0){
            return count;
        } else {
            throw new IllegalArgumentException("No such goods");
        }
    }

    public Map<String, Integer> getStatistics(){
        Map<String, Integer> goods = new HashMap<>();
        for (Customer customer : customers) {
            for (Map.Entry<String, List<Item>> listEntry : customer.getTransactions().entrySet()) {
                for (Item item : listEntry.getValue())
                    if (!goods.containsKey(item.getItemName())) {
                        goods.put(item.getItemName(),1);
                    } else {
                        int count = goods.get(item.getItemName()) + 1;
                        goods.put(item.getItemName(),count);
                    }
            }
        }
            return goods;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.readFromFile();
        System.out.println(shop.getTransactionsValue("111"));
        System.out.println(shop.getCustomerSpentSum("BK123"));
        System.out.println(shop.getSortedItemsOfTransactions("BK123", "567").toString());
        System.out.println(shop.getGoodsPiece("bread"));
        System.out.println(shop.getStatistics().toString());
    }
}