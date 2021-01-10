package collectionsmap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class LogParser {
    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static final int ENTRY_IP_ADDRESS_POSITION = 0;
    public static final int ENTRY_DATE_POSITION = 1;
    public static final int ENTRY_LOGIN_POSITION = 2;
    public static final int ENTRY_FIELDS_NUMBER = 3;
    public static final String ENTRY_FIELD_SEPARATOR = ":";

    public Map<String, List<Entry>> parseLog(String log) {
        try (Scanner scanner = new Scanner(log)) {
            Map<String, List<Entry>> logList = new HashMap<>();
            while (scanner.hasNext()) {
                String line = scanner.next();
                String[] lineParts = line.split(ENTRY_FIELD_SEPARATOR);
                if (lineParts.length != ENTRY_FIELDS_NUMBER) {
                    throw new IllegalArgumentException("Incorrect log: incorrect number of fields");
                }
                LocalDate entryDate = parseDate(lineParts[ENTRY_DATE_POSITION]);
                addMap(logList, new Entry(lineParts[ENTRY_IP_ADDRESS_POSITION], lineParts[ENTRY_LOGIN_POSITION], entryDate));

            }
            return logList;
        }
    }

    private void addMap(Map<String, List<Entry>> logList, Entry entry) {
        if (!logList.containsKey(entry.getIpAddress())) {
            logList.put(entry.getIpAddress(), new ArrayList<>());
        }

        logList.get(entry.getIpAddress()).add(entry);
    }

    private LocalDate parseDate(String date) {
        try {
            return LocalDate.parse(date, DATE_FORMAT);
        } catch (DateTimeParseException dtpe){
            throw new IllegalArgumentException("Incorrect log: incorrect date");
        }
    }
}
