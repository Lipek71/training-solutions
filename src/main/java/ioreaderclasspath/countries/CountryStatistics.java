package ioreaderclasspath.countries;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {
    private List<Country> countryList = new ArrayList<>();


    public List<Country> getCountryList() {
        return new ArrayList<>(countryList);
    }

    public void readFromFile(String filePath) {
        Path file = Path.of(filePath);
        try (BufferedReader bufferedReader = Files.newBufferedReader(file)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineParts = line.split(" ");
                countryList.add(new Country(lineParts[0], Integer.parseInt(lineParts[1])));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read the file!");
        }
    }

    public int numberOfCountries() {
        return countryList.size();
    }

    public Country mostBorderCountries() {
        Country countryMostBorder = countryList.get(0);
        for (Country country : countryList) {
            if (countryMostBorder.getBorderCountries() < country.getBorderCountries()) {
                countryMostBorder = country;
            }
        }
        return countryMostBorder;
    }
}
