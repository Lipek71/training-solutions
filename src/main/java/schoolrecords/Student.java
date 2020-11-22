package schoolrecords;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private List<Mark> marks = new ArrayList<>();
    private String name;

    public double calculateAverage() {
        DecimalFormat df = new DecimalFormat("0.00");
        int countAverage = 0;
        int sumAverage = 0;
        double average;
        for (Mark item : marks) {
            countAverage++;
            sumAverage += item.getMarkType().getValue();
        }
        if(countAverage == 0){
            return 0.0;
        }
        average = (double) sumAverage / (double) countAverage;
        return Double.parseDouble(df.format(average).replace(',','.'));
    }

    public double calculateSubjectAverage(Subject subject) {
        DecimalFormat df = new DecimalFormat("0.00");
        int countAverage = 0;
        int sumAverage = 0;
        double average;
        for (Mark item : marks) {
            if(item.getSubject().getSubjectName() == subject.getSubjectName()){
                countAverage++;
                sumAverage += item.getMarkType().getValue();
            }
        }
        if(countAverage == 0){
            return 0.0;
        }
        average = (double) sumAverage / (double) countAverage;
        return Double.parseDouble(df.format(average).replace(',','.'));
    }

    public boolean equals(Object object) {
        return false;
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        } else {
            marks.add(mark);
        }
    }

    boolean isEmpty(String str) {
        return false;
    }

    public Student(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return getName() + " marks: " + marks.get(0).getSubject().getSubjectName() + ": " + marks.get(0).getMarkType().getDescription() + "(" + marks.get(0).getMarkType().getValue() + ")";
    }

    public static void main(String[] args) {
        final Subject MATH = new Subject("matematika");
        final Tutor TUTOR = new Tutor("Nagy Lilla", Arrays.asList(MATH, new Subject("történelem")));

        Student student = new Student("Kovács");

        student.grading(new Mark(MarkType.A, MATH, TUTOR));
        student.grading(new Mark(MarkType.C, MATH, TUTOR));
        student.grading(new Mark(MarkType.D, MATH, TUTOR));

        System.out.println(student.calculateAverage());
    }
}
