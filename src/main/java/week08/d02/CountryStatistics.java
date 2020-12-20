package week08.d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {
    protected List<String> countries = new ArrayList<>();

    protected List<String> readCountries() {
        Path file = Path.of("src/main/java/week08/d02/countries.txt");
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                countries.add(line);
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file", ioe);
        }
        return countries;
    }

    public String maxPopulation(List<String> countries) {
        int maxPopulationCountry = 0;
        String maxPopulationCountryDatas = "";
        for (String country : countries) {
            String[] countryParts = country.split(" ");
            if(Integer.parseInt(countryParts[1]) > maxPopulationCountry){
                maxPopulationCountry = Integer.parseInt(countryParts[1]);
                maxPopulationCountryDatas = country;
            }
        }
        return maxPopulationCountryDatas;
    }

    public static void main(String[] args) {
        CountryStatistics countryStatistics = new CountryStatistics();
        countryStatistics.readCountries();
        System.out.println(countryStatistics.maxPopulation(countryStatistics.countries));
    }
}

