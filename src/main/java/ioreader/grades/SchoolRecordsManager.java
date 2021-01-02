package ioreader.grades;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SchoolRecordsManager {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void readGradesFromFile(String filePath){
        Path file = Path.of("src/main/resources/" + filePath);
        try (BufferedReader reader = Files.newBufferedReader(file)){
            String line;
            while ((line = reader.readLine()) != null){
                String[] lineParts = line.split(" ");
                List<Integer> grades = new ArrayList<>();
                for (int i = 1; i < lineParts.length; i++) {
                    grades.add(Integer.parseInt(lineParts[i]));
                }
                Student s = new Student(lineParts[0], grades);
                students.add(s);
            }
        } catch (IOException ioe){
            throw new IllegalArgumentException("Can't read the file!", ioe);
        }
    }

    public double classAverage(){
        double gradesSum=0;
        for(Student student: students){
            gradesSum+=student.average();
        }
        return gradesSum/students.size();

    }

}
