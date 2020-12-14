package interfaces.animal;

import java.util.List;

public class Zoo implements Animal{
    private List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public int getNumberOfAnimals(){
        return this.animals.size();
    }

    @Override
    public int getNumberOfLegs(){
        int legs = 0;
        for(Animal part : animals){
            legs += part.getNumberOfLegs();
        }
        return legs;
    }

    @Override
    public String getName() {
        return null;
    }
}
