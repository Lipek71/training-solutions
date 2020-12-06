package defaultconstructor.date;

public class SimpleDateFormatter {
    CountryCode countryCode;
    public static final String SEPARATOR = "-";

    public SimpleDateFormatter() {
        countryCode = CountryCode.HU;
    }

    public String formatDateString(SimpleDate simpleDate) {
        return formatDateStringByCountryCode(countryCode, simpleDate);
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        if (countryCode == CountryCode.HU) {
            return simpleDate.getYear() + SEPARATOR + simpleDate.getMonth() + SEPARATOR + simpleDate.getDay();
        } else if (countryCode == CountryCode.EN) {
            return simpleDate.getDay() + SEPARATOR + simpleDate.getMonth() + SEPARATOR + simpleDate.getYear();
        } else {
            return simpleDate.getMonth() + SEPARATOR + simpleDate.getDay() + SEPARATOR + simpleDate.getYear();
        }
    }

    public static void main(String[] args) {
        SimpleDateFormatter simpleDateFormatter = new SimpleDateFormatter();
        System.out.println(simpleDateFormatter.formatDateString(new SimpleDate()));
    }
}
