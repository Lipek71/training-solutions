package iowritestring.school;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    Diary diary = new Diary();

    @Test
    void newMark() {

        diary.newMark("Lipka_Laszlo", 5);
        diary.newMark("Lipka_Laszlo", 2);
        diary.newMark("Lipka_Gergo", 5);
        diary.newMark("Lipka_Laszlo", 5);
        diary.newMark("Lipka_Gergo", 5);
        diary.newMark("Lipka_Laszlo", 5);
        assertTrue(Files.exists(Path.of("Lipka_Laszlo.txt")));
        assertTrue(Files.exists(Path.of("Lipka_Gergo.txt")));

    }

    @Test
    void average() throws IOException {
        diary.average("Lipka_Laszlo");
        diary.average("Lipka_Gergo");
        Path file = Path.of("Lipka_Laszlo.txt");
        List<String> fileLines = Files.readAllLines(file);
        assertEquals(5, fileLines.size());
    }
}