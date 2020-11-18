package algorithmsmax.trainer;

import java.util.ArrayList;
import java.util.List;

public class MaxAgeCalculator {
    private List<Trainer> trainers = new ArrayList<>();

    public Trainer trainerWithMaxAge(List<Trainer> trainers){
        Trainer trainerWithMaxAge = null;
        for(Trainer item: trainers){
            if(trainerWithMaxAge == null || item.getAge() > trainerWithMaxAge.getAge()){
                trainerWithMaxAge = item;
            }
        }
        return trainerWithMaxAge;
    }
}
