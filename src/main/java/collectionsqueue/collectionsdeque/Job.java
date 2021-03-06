package collectionsqueue.collectionsdeque;

public class Job implements Comparable<Job>{
    final int priority;
    final String jobDescription;
    final boolean urgent;

    public Job(int priority, String jobDescription) {
        this.priority = priority;
        this.jobDescription = jobDescription;
        urgent = priority < 5;
    }

    public int getPriority() {
        return priority;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public boolean isUrgent() {
        return urgent;
    }

    @Override
    public int compareTo(Job o) {
        return this.priority - o.priority;
    }

    @Override
    public String toString() {
        return "Job{" +
                "priority=" + priority +
                ", jobDescription='" + jobDescription + '\'' +
                ", urgent=" + urgent +
                '}';
    }
}
