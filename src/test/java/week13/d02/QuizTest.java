package week13.d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuizTest {

    @Test
    void readFile() {
        Quiz quiz = new Quiz();
        quiz.readFile("src/main/java/week13/d02/result.txt");
        assertEquals(20, quiz.answers.size());
        assertEquals(4, quiz.answersMap.size());
    }

    @Test
    void getAnswerTest() {
        Quiz quiz = new Quiz();
        quiz.readFile("src/main/java/week13/d02/result.txt");
        assertTrue(quiz.getAnswer("AH2", 2));
        assertFalse(quiz.getAnswer("AH2", 4));
    }

    @Test
    void getMostXTest() {
        Quiz quiz = new Quiz();
        quiz.readFile("src/main/java/week13/d02/result.txt");
        assertEquals("BD452", quiz.getMostX());
    }

    @Test
    void getMostPointsTest() {
        Quiz quiz = new Quiz();
        quiz.readFile("src/main/java/week13/d02/result.txt");
        assertEquals("GH1234", quiz.getMostPoints());
    }

    @Test
    void getMostPoints2Test() {
        Quiz quiz = new Quiz();
        quiz.readFile("src/main/java/week13/d02/result.txt");
        assertEquals("GH1234", quiz.getMostPoints2());
    }
}