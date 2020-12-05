package methodoverloading.pub;

import java.util.ArrayList;
import java.util.List;

public class ListOfGoodPubs {
    private List<Pub> goodPubs = new ArrayList<>();

    public ListOfGoodPubs(List<Pub> goodPubs){
        if (goodPubs == null || goodPubs.isEmpty()){
            throw new IllegalArgumentException("Pub list is empty!");
        }
        this.goodPubs = goodPubs;
    }

    public Pub findTheBest(){
        if (goodPubs == null || goodPubs.isEmpty()){
            throw new IllegalArgumentException("Pub list is empty!");
        }
        Pub bestPub = goodPubs.get(0);
        for(int i =1 ; i < goodPubs.size(); i++){
            if ((goodPubs.get(i).getOpenFrom().getHour() < bestPub.getOpenFrom().getHour()) ||
                    (goodPubs.get(i).getOpenFrom().getHour() == bestPub.getOpenFrom().getHour() &&
                            goodPubs.get(i).getOpenFrom().getMinute() < bestPub.getOpenFrom().getMinute())){
                bestPub = goodPubs.get(i);
            }
        }
        return bestPub;
    }

}
