package week15.d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.*;

public class Bitcoin {
    /*private List<Integer> exchange = new ArrayList<>();
    private List<DailyExchange> dailyExchanges = new ArrayList<>();*/
    private Map<Integer, Integer> exchangeMap = new HashMap<>();

    /*public List<Integer> getExchange() {
        return exchange;
    }

    public List<DailyExchange> getDailyExchanges() {
        return dailyExchanges;
    }*/

    public Map<Integer, Integer> getExchangeMap() {
        return exchangeMap;
    }

    /*public void readFile(String filePath) {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(
                Bitcoin.class.getResourceAsStream(filePath))
        )) {
            String line = bf.readLine();
            while (line != null) {
                exchange.add(Integer.parseInt(line.split(" ")[1]));
                line = bf.readLine();
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't open the file!", ioe);
        }
    }

    public void readFileDailyExchange(String filePath) {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(
                Bitcoin.class.getResourceAsStream(filePath))
        )) {
            int day = 0;
            String line = bf.readLine();
            while (line != null) {
                dailyExchanges.add(new DailyExchange(day, Integer.parseInt(line.split(" ")[1])));
                line = bf.readLine();
                day++;
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't open the file!", ioe);
        }
    }*/

    public void readFileMap(String filePath) {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(
                Bitcoin.class.getResourceAsStream(filePath))
        )) {
            int day = 0;
            String line = bf.readLine();
            while (line != null) {
                exchangeMap.put(Integer.parseInt(line.split(" ")[1]), day);
                line = bf.readLine();
                day++;
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't open the file!", ioe);
        }
    }

    /*public MinMaxDay bitcoinBestBuying(List<Integer> bitcoinExchange) {
        IntSummaryStatistics bitcoinStat = bitcoinExchange.stream().mapToInt(bE -> bE).summaryStatistics();
        return new MinMaxDay(bitcoinStat.getMin(), bitcoinStat.getMax());
    }

    public MinMaxDay bitcoinBestBuyingDailyExchange(List<DailyExchange> bitcoinExchange) {
        IntSummaryStatistics bitcoinStat = bitcoinExchange.stream().mapToInt(bE -> bE.getDay()).summaryStatistics();
        return new MinMaxDay(bitcoinStat.getMin(), bitcoinStat.getMax());
    }*/

    public MinMaxDay bitcoinBestBuyingMap(Map<Integer, Integer> bitcoinExchange) {
        IntSummaryStatistics bitcoinStat = bitcoinExchange.keySet().stream().mapToInt(bE -> bE).summaryStatistics();
        return new MinMaxDay(getExchangeMap().get(bitcoinStat.getMin()), getExchangeMap().get(bitcoinStat.getMax()), bitcoinStat.getMax() - bitcoinStat.getMin());
    }


    public static void main(String[] args) {
        Bitcoin bitcoin = new Bitcoin();
        /*bitcoin.readFile("/bitcoin.txt");
        System.out.println(bitcoin.getExchange());
        System.out.println(bitcoin.bitcoinBestBuying(bitcoin.getExchange()));

        bitcoin.readFileDailyExchange("/bitcoin.txt");
        System.out.println(bitcoin.getDailyExchanges());
        System.out.println(bitcoin.bitcoinBestBuyingDailyExchange(bitcoin.getDailyExchanges()));*/

        bitcoin.readFileMap("/bitcoin.txt");
        System.out.println(bitcoin.exchangeMap);
        System.out.println(bitcoin.bitcoinBestBuyingMap(bitcoin.getExchangeMap()));

    }
}
