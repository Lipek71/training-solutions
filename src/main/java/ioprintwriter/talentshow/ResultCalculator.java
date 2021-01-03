package ioprintwriter.talentshow;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ResultCalculator {
    private List<Production> productions = new ArrayList<>();
    private List<Vote> votes = new ArrayList<>();
    public void readTalents(Path talentsFile) {
        try(BufferedReader reader = Files.newBufferedReader(talentsFile)){
            String line;
            while ((line = reader.readLine()) != null){
                String[] lineParts = line.split(" ");
                productions.add(new Production(Integer.parseInt(lineParts[0]), lineParts[1]));
            }
    } catch (IOException ioe){
            throw new IllegalStateException("Can't read the file!");
        }
    }

    public void calculateVotes(Path votesFile) {
        for (Production production: productions){
            votes.add(new Vote(production.getId(), 0));
        }
        try(BufferedReader reader = Files.newBufferedReader(votesFile)){
            String line;
            while ((line = reader.readLine()) != null){
                for(Vote vote: votes){
                    if(vote.getId() == Integer.parseInt(line)){
                        vote.incNum();
                    }
                }
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't read the file!");
        }
    }

    public void writeResultToFile(Path resultFile){
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(resultFile))){
        int maxVotes = 0;
        String winProd = "";
        for (Production production: productions){
            for (Vote vote : votes){
                if (vote.getId() == production.getId()){
                    writer.print(production.getId());
                    writer.print(" ");
                    writer.print(production.getName());
                    writer.print(" ");
                    writer.println(vote.getNumber());
                    if (vote.getNumber() > maxVotes){
                        maxVotes = vote.getNumber();
                        winProd = production.getName();
                    }
                }
            }
        }
        writer.print("Winner: ");
        writer.print(winProd);
        } catch (IOException ioe){
            throw new IllegalStateException("Can't write the file!");
        }
    }

    public List<Production> getProductions() {
        return new ArrayList<>(productions);
    }

    public List<Vote> getVotes() {
        return new ArrayList<>(votes);
    }

}
