package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Diary {
    public void newMark(String name, int grade) {
        Path file = Path.of(name + ".txt");
        try {
            if (Files.exists(file)) {
                Files.writeString(file, grade + "\n", StandardOpenOption.APPEND);
            } else {
                Files.writeString(file, grade + "\n");
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can't write the file", ioe);
        }
    }

    public void average(String name){
        Path file = Path.of(name + ".txt");
        try {
            int sum = 0;
            int count = 0;
            List<String> fileLines = Files.readAllLines(file);
            for (String str : fileLines) {
                count++;
                sum += Integer.parseInt(str);
            }
            Files.writeString(file, "Average: " + (double) sum / count + "\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
    }

    public static void main(String[] args) {
        Diary diary = new Diary();
        diary.newMark("Lipka_Laszlo", 5);
        diary.newMark("Lipka_Laszlo", 2);
        diary.newMark("Lipka_Gergo", 5);
        diary.newMark("Lipka_Laszlo", 5);
        diary.newMark("Lipka_Gergo", 5);
        diary.newMark("Lipka_Laszlo", 5);
        diary.average("Lipka_Laszlo");
        diary.average("Lipka_Gergo");
    }
}
