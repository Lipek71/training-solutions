package week13.d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Quiz {
    String results;
    List<String> answers = new ArrayList<>();
    Map<String, String> answersMap = new HashMap<>();

    public void readFile(String file) {
        try (BufferedReader br = Files.newBufferedReader(Path.of(file))) {
            String line = br.readLine();
            results = line;
            while ((line = br.readLine()) != null) {
                answers.add(line);
                String[] lineParts = line.split(" ");
                if (answersMap.containsKey(lineParts[0])) {
                    answersMap.put(lineParts[0], answersMap.get(lineParts[0]) + lineParts[1]);
                } else {
                    answersMap.put(lineParts[0], lineParts[1]);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read the file!", ioe);
        }
    }

    public boolean getAnswer(String team, int question) {
        List<String> teamAnswers;
        teamAnswers = answers.stream().filter(a -> a.split(" ")[0].equals(team)).limit(question).map(a -> a.split(" ")[1]).collect(Collectors.toList());
        return teamAnswers.get(question - 1).charAt(0) == (results.charAt(question - 1));
    }

    public String getMostX() {
        String mostX = "";
        int answerX = 0;
        int mostAnswerX = 0;
        for (String key : answersMap.keySet()) {
            for (int i = 0; i < answersMap.get(key).length(); i++) {
                if (answersMap.get(key).toLowerCase().charAt(i) == 'x') {
                    answerX++;
                }
            }
            if (answerX > mostAnswerX) {
                mostX = key;
                mostAnswerX = answerX;
            }
            answerX = 0;
        }
        return mostX;
    }

    public String getMostPoints() {
        String mostPoints = "";
        int answerPoints = 0;
        int mostAnswerPoints = 0;
        for (String key : answersMap.keySet()) {
            for (int i = 0; i < answersMap.get(key).length(); i++) {
                if (answersMap.get(key).toUpperCase().charAt(i) == results.charAt(i)) {
                    answerPoints += i + 1;
                }
            }
            if (answerPoints > mostAnswerPoints) {
                mostPoints = key;
                mostAnswerPoints = answerPoints;
            }
            answerPoints = 0;
        }
        return mostPoints;
    }

    public String getMostPoints2() {
        String mostPoints = "";
        int answerPoints = 0;
        int mostAnswerPoints = 0;
        for (String key : answersMap.keySet()) {
            for (int i = 0; i < answersMap.get(key).length(); i++) {
                if (answersMap.get(key).toUpperCase().charAt(i) == results.charAt(i)) {
                    answerPoints += i + 1;
                } else if(answersMap.get(key).toUpperCase().charAt(i) != 'X'){
                    answerPoints -= 2;
                }
            }
            if (answerPoints > mostAnswerPoints) {
                mostPoints = key;
                mostAnswerPoints = answerPoints;
            }
            answerPoints = 0;
        }
        return mostPoints;
    }
}
