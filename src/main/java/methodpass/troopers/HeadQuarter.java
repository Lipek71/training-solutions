package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {
    List<Trooper> headQuarter = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return headQuarter;
    }

    public void addTrooper(Trooper trooper) {
        if (trooper == null) {
            throw new IllegalArgumentException("No Trooper!");
        }
        headQuarter.add(trooper);
    }

    public void moveTrooperByName(String name, Position target) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("No name!");
        }
        if (target == null) {
            throw new IllegalArgumentException("No target!");
        }
        for (Trooper trooper : headQuarter) {
            if (trooper.getName().equals(name)) {
                trooper.changePosition(target);
            }
        }
    }

    public void moveClosestTrooper(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("No target!");
        }
        double minDistance = target.distanceFrom(headQuarter.get(0).getPosition());
        Trooper trooper = headQuarter.get(0);
        for (int i = 1; i < headQuarter.size(); i++){
            if(target.distanceFrom(headQuarter.get(i).getPosition()) < minDistance){
                minDistance = target.distanceFrom(headQuarter.get(i).getPosition());
                trooper = headQuarter.get(i);
            }
        }
        trooper.changePosition(target);
    }

    public Trooper findTrooperByName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("No name!");
        }
        for(Trooper trooper: headQuarter){
            if(trooper.getName().equals(name)){
                return trooper;
            }
        }
        return null;
    }

    public Trooper findClosestTrooper(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("No target!");
        }
        double minDistance = target.distanceFrom(headQuarter.get(0).getPosition());
        Trooper trooper = headQuarter.get(0);
        for (int i = 1; i < headQuarter.size(); i++){
            if(target.distanceFrom(headQuarter.get(i).getPosition()) < minDistance){
                minDistance = target.distanceFrom(headQuarter.get(i).getPosition());
                trooper = headQuarter.get(i);
            }
        }
        return trooper;
    }

    public void moveTrooper(Trooper trooper, Position target) {
        if (trooper == null) {
            throw new IllegalArgumentException("No trooper!");
        }
        if (target == null) {
            throw new IllegalArgumentException("No target!");
        }
        for(Trooper trooper1: headQuarter){
            if(trooper1.equals(trooper)){
                trooper1.changePosition(target);
            }
        }
    }
}
