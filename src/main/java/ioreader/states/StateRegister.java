package ioreader.states;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StateRegister {
    private List<State> states = new ArrayList<>();

    public List<State> getStates() {
        return new ArrayList<>(states);
    }

    public void readStatesFromFile(String filePath) {
        Path file = Path.of("src/main/resources/" + filePath);
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String lineParts[] = line.split("-");
                states.add(new State(lineParts[0], lineParts[1]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
    }

    public String findCapitalByStateName(String stateName) {
        String capitalName = "";
        for (State state : states){
            if (state.getStateName().equals(stateName)){
                capitalName = state.getCapital();
            }
        }
        if("".equals(capitalName)){
            throw new IllegalArgumentException("No state with this name!");
        }

        return capitalName;
    }
}
