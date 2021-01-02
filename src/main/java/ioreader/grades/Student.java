package ioreader.grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> gradeList;

    public Student(String name, List<Integer> gradeList) {
        this.name = name;
        this.gradeList = gradeList;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGradeList() {
        return new ArrayList<>(gradeList);
    }

    public double average(){
        int gradesSum = 0;
        int gradesCount = 0;
        for (Integer grade: gradeList){
            gradesSum += grade;
            gradesCount++;
        }
        return (double) gradesSum / gradesCount;
    }

    public boolean isIncreasing(){
        int gradeFirst = gradeList.get(0);
        for (Integer grade : gradeList){
            if (gradeFirst > grade){
                return false;
            } else {
                gradeFirst = grade;
            }
        }
        return true;
    }

}
