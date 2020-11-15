package introconstructors;

import java.sql.Time;
import java.util.Date;

public class Task {
    private String title;
    private String description;
    private Date startDateTime;
    private Time duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public void start() {
        //startDateTime = "2020.11.06. 10:00";
    }
}
