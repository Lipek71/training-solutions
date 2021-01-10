package collectionsmap;

import java.time.LocalDate;

public class Entry {
    private String ipAddress;
    private LocalDate entryDate;
    private String login;

    public Entry(String ipAddress, String login, LocalDate entryDate) {
        this.ipAddress = ipAddress;
        this.login = login;
        this.entryDate = entryDate;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public String getLogin() {
        return login;
    }
}
