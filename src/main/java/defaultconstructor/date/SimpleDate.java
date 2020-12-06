package defaultconstructor.date;

public class SimpleDate {
    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day) {
        if (!isValidYear(year) || !isValidMonth(month) || !isValidDay(year, month, day)) {
            throw new IllegalArgumentException("One or more given parameter cannot be applied!" + " " + year + ", " + month + ", " + day);
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private boolean isValidDay(int year, int month, int day) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return day > 0 && day < 32 ? true : false;
            case 4:
            case 6:
            case 9:
            case 11:
                return day > 0 && day < 31 ? true : false;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    return day > 0 && day < 30 ? true : false;
                } else {
                    return day > 0 && day < 29 ? true : false;
                }

        }
        return false;
    }

    private boolean isValidMonth(int month) {
        return month > 0 && month < 13 ? true : false;
    }

    private boolean isValidYear(int year) {
        return year >= 1900 ? true : false;


    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
