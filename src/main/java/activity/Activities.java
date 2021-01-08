package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {
    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Report> distancesByTypes() {
        double distanceBiking = 0;
        double distanceHiking = 0;
        double distanceRunning = 0;
        for (Activity activity : activities) {
            if (activity.getType() == ActivityType.BIKING) {
                distanceBiking += activity.getDistance();
            }
            if (activity.getType() == ActivityType.HIKING) {
                distanceHiking += activity.getDistance();
            }
            if (activity.getType() == ActivityType.RUNNING) {
                distanceRunning += activity.getDistance();
            }
        }
        List<Report> reports = new ArrayList<>();
        reports.add(new Report(ActivityType.BIKING, distanceBiking));
        reports.add(new Report(ActivityType.HIKING, distanceHiking));
        reports.add(new Report(ActivityType.RUNNING, distanceRunning));
        reports.add(new Report(ActivityType.BASKETBALL,0.0));

        return reports;
    }

    public int numberOfTrackActivities() {
        int count = 0;
        for (Activity activity : activities){
            if (activity.getType() != ActivityType.BASKETBALL){
                count++;
            }
        }
        return count;
    }

    public int numberOfWithoutTrackActivities() {
        int count = 0;
        for (Activity activity : activities){
            if (activity.getType() == ActivityType.BASKETBALL){
                count++;
            }
        }
        return count;
    }

}
