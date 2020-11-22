package schoolrecords;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassRecords {
    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public boolean addStudent(Student student) {
        boolean addStudentValue = true;
        for (Student item : students) {
            if (item.getName() == student.getName()) {
                addStudentValue = false;
            }
        }
        if (addStudentValue) {
            students.add(student);
        }
        return addStudentValue;
    }

    public double calculateClassAverage() {
        DecimalFormat df = new DecimalFormat("0.00");
        int countAverage = 0;
        double sumAverage = 0.0;
        double average;

        if (students.size() == 0){
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        for(Student itemStudents : students){
            if(itemStudents.calculateAverage() != 0.0){
                countAverage++;
                sumAverage += itemStudents.calculateAverage();
            }
        }
        if(countAverage == 0){
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        average = (double) sumAverage / (double) countAverage;
        return Double.parseDouble(df.format(average).replace(',','.'));
    }

    public double calculateClassAverageBySubject(Subject subject) {
        DecimalFormat df = new DecimalFormat("0.00");
        int countAverage = 0;
        double sumAverage = 0.0;
        double average;

        if (students.size() == 0){
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        for(Student itemStudents : students){
            if(itemStudents.calculateSubjectAverage(subject) != 0.0 ){
                countAverage++;
                sumAverage += itemStudents.calculateSubjectAverage(subject);
            }
        }
        if(countAverage == 0){
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        average = (double) sumAverage / (double) countAverage;
        return Double.parseDouble(df.format(average).replace(',','.'));
    }

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public Student findStudentByName(String str) {
        Student student;
        boolean studentValue=false;
        int studentCount = 0;
        int studentNumber = 0;
        if(str == null || str.isBlank()){
           throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.size() == 0){
            throw new IllegalStateException("No students to search!");
        }
        for(Student item : students){
            if (item.getName() == str){
                studentValue = true;
                studentNumber = studentCount;
            }
            studentCount++;
        }
        if(!studentValue){
            throw new IllegalArgumentException("Student by this name cannot be found! " + str );
        }
        return students.get(studentNumber);
    }

    public String getClassName() {
        return className;
    }

    boolean isEmpty(String str) {
        return false;
    }

    public String listStudentNames() {
        String listStudent = "";
        for(Student itemStudents : students){
            listStudent += itemStudents.getName() + ", ";
        }
        listStudent = listStudent.substring(0, listStudent.length()-2);
        return listStudent;
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> list = new ArrayList<>();
        String studentName;
        double studyAverage;
        int studyCount=0;
        for(Student itemStudent : students){
            studentName = students.get(studyCount).getName();
            studyAverage = students.get(studyCount).calculateAverage();
            list.add(studyCount,new StudyResultByName(studentName, studyAverage));
            studyCount++;
        }
        return list;
    }

    public boolean removeStudent(Student student) {
        int removeStudentIndex = 0;
        int removeStudentCount = 0;
        boolean removeStudentValue = false;
        for (Student item : students) {
            if (item.getName() == student.getName()) {
                removeStudentIndex = removeStudentCount;
                removeStudentValue = true;
            }
            removeStudentCount++;
        }
        return removeStudentValue;
    }

    public Student repetition() {
        int numberOfSutendt;
        if(students.size() == 0){
            throw new IllegalStateException("No students to select for repetition!");
        }
        numberOfSutendt = rnd.nextInt(students.size());
        return students.get(numberOfSutendt);
    }

    public static void main(String[] args) {
        Tutor tutor = new Tutor("Nagy Csilla",
                Arrays.asList(new Subject("földrajz"),
                        new Subject("matematika"),
                        new Subject("biológia"),
                        new Subject("zene"),
                        new Subject("fizika"),
                        new Subject("kémia")));

        ClassRecords classRecords = new ClassRecords("Fourth Grade A", new Random(5));
        Student firstStudent = new Student("Kovács Rita");
        Student secondStudent = new Student("Nagy Béla");
        Student thirdStudent = new Student("Varga Márton");
        firstStudent.grading(new Mark(MarkType.A, new Subject("földrajz"), tutor));
        firstStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        firstStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
        secondStudent.grading(new Mark(MarkType.A, new Subject("biológia"), tutor));
        secondStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        secondStudent.grading(new Mark(MarkType.D, new Subject("zene"), tutor));
        thirdStudent.grading(new Mark(MarkType.A, new Subject("fizika"), tutor));
        thirdStudent.grading(new Mark(MarkType.C, new Subject("kémia"), tutor));
        thirdStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
        classRecords.addStudent(firstStudent);
        classRecords.addStudent(secondStudent);
        classRecords.addStudent(thirdStudent);

        System.out.println(classRecords.repetition().getName());
    }

}
