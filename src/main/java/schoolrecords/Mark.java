package schoolrecords;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Mark {
    private MarkType markType;
    private Subject subject;
    private Tutor tutor;

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        if(markType == null || subject == null || tutor == null){
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return markType.getDescription() + "(" + markType.getValue() + ")";
    }

    public static void main(String[] args) {
        final Subject SUBJECT = new Subject("matematika");
        final Tutor TUTOR = new Tutor("Nagy Lilla", Arrays.asList(SUBJECT));

        Mark mark = new Mark(MarkType.A, SUBJECT, TUTOR);
        System.out.println(mark.getMarkType());
        System.out.println(mark.getSubject());
        System.out.println(mark.getTutor());
        System.out.println(mark.toString());
    }
}
