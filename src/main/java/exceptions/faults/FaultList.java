package exceptions.faults;

import org.opentest4j.AssertionFailedError;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FaultList {
    List<String> errors = new ArrayList<>();
    String errorLine = "";
    int errorCount = 0;

    public List<String> processLines(List<String> lines) {
        try {
            for (String parts : lines) {
                this.errorLine = "";
                this.errorCount = 0;
                String[] partsItems = parts.split(",");
                if (partsItems.length == 3) {
                    isNumber(partsItems[0], partsItems[1]);
                    isDate(partsItems[0], partsItems[2]);
                    writeError(errorLine, errorCount);
                } else {
                    errorLine = partsItems[0];
                    errorCount += 2;
                    writeError(errorLine, errorCount);
                }
            }
        } catch (NullPointerException npe) {
            throw new IllegalArgumentException(npe);
        }
        return errors;
    }

    private void writeError(String errorLine, int errorCount) {
        if (errorCount > 0) {
            errors.add(errorLine + "," + errorCount);
        }
    }

    private void isNumber(String line, String doubleNumber) {
        try {
            Integer.parseInt(line);
            Double.parseDouble(doubleNumber);
        } catch (NumberFormatException nfe) {
            errorLine = line;
            errorCount += 4;
        } catch (AssertionFailedError afe) {
            errorCount -= 4;
        }
    }

    private void isDate(String line, String date) {
        try {
            Integer.parseInt(line);
            DateFormat df = new SimpleDateFormat("yyyy.MM.dd.");
            df.parse(date);
        } catch (ParseException pe) {
            errorLine = line;
            errorCount += 8;
        } catch (NumberFormatException nfe) {
            errorCount -= 4;
        }
    }
}
