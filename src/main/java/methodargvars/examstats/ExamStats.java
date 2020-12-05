package methodargvars.examstats;

public class ExamStats {
    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        int numberOfTopGrades = 0;
        for (int i = 0; i < results.length; i++) {
            if (results[i] > getMaxPoints() * limitInPercent / 100) {
                numberOfTopGrades++;
            }
        }
        return numberOfTopGrades;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        boolean anyFailed = false;
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        for (int i = 0; i < results.length; i++) {
            if (results[i] < getMaxPoints() * limitInPercent / 100) {
                anyFailed = true;
            }
        }
        return anyFailed;
    }
}
