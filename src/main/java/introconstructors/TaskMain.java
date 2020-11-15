package introconstructors;

public class TaskMain {
    public static void main(String[] args) {
        Task task1 = new Task("Telefonálni", "Biztosító, EON");
        System.out.println(task1.getTitle() + task1.getDescription());
        System.out.println(task1.getDuration());
    }
}
