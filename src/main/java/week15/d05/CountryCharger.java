package week15.d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class CountryCharger {
    Map<String, Country> countries = new HashMap<>();

    public Map<String, Country> countryReader(String file) {
        try (BufferedReader bf = Files.newBufferedReader(Path.of(file))) {
            String line = bf.readLine();
            while ((line = bf.readLine()) != null) {
                while (line.split(",")[7].isBlank()){
                    line = bf.readLine();
                }
                String[] lineParts = line.split(",");
                lineParts[2] = lineParts[2].isBlank() ? lineParts[2] = "0" : lineParts[2];
                if (countries.containsKey(lineParts[4])) {
                    int notification = countries.get(lineParts[4]).getNotification() + Integer.parseInt(lineParts[2]);
                    countries.get(lineParts[4]).setNotification(notification);
                    countries.get(lineParts[4]).setRate(notification / Double.parseDouble(lineParts[7]));
                } else {
                    countries.put(lineParts[4], new Country(lineParts[4], Integer.parseInt(lineParts[2]), Double.parseDouble(lineParts[2]) / Integer.parseInt(lineParts[7])));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't open the file!", ioe);
        }

        return countries;
    }

    public List<Country> getMostThreeCountries() {
        /*List<Country> countryList = new ArrayList<>();
        for (Country country : countries.values()) {
            countryList.add(country);
        }
        countryList.sort(Comparator.comparing(Country::getRate).reversed());
        return countryList.subList(0,3);*/

        return countries.values()
                .stream()
                .sorted(Comparator.comparing(Country::getRate).reversed())
                .limit(3)
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        CountryCharger countryCharger = new CountryCharger();
        countryCharger.countryReader("src/main/java/week15/d05/data.csv");

        List<Country> result = countryCharger.getMostThreeCountries();
        System.out.println(result.get(0).getName() + " esetszám: " + result.get(0).getNotification() + ", ráta:" + BigDecimal.valueOf(result.get(0).getRate()*1000).setScale(2, RoundingMode.HALF_UP));
        System.out.println(result.get(1).getName() + " esetszám: " + result.get(1).getNotification() + ", ráta:" + BigDecimal.valueOf(result.get(1).getRate()*1000).setScale(2, RoundingMode.HALF_UP));
        System.out.println(result.get(2).getName() + " esetszám: " + result.get(2).getNotification() + ", ráta:" + BigDecimal.valueOf(result.get(2).getRate()*1000).setScale(2, RoundingMode.HALF_UP));

        System.out.println(result.toString());

    }
}
