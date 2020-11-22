package schoolrecords;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Tutor {
    private String name;
    private List<Subject> taughtSubjects = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Tutor(String name, List<Subject> taughtSubjects) {
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    boolean tutorTeachingSubject(Subject subject) {
        boolean tutorTeachingSubjectValue = false;
        for(Subject item: taughtSubjects){
            if (item.getSubjectName() == subject.getSubjectName()){
                tutorTeachingSubjectValue = true;
            }
        }
        return tutorTeachingSubjectValue;
    }
}