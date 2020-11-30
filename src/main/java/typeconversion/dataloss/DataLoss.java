package typeconversion.dataloss;

import java.util.ArrayList;
import java.util.List;

public class DataLoss {
    public List<Long> dataLoss(){
        List<Long> longList = new ArrayList<>();
        long number=0;
        while(longList.size() != 3){
            if(number != (long)(float)number){
                longList.add(number);
            }
            ++number;
        }
        return longList;
    }

    public static void main(String[] args) {
        DataLoss dataLoss = new DataLoss();
        System.out.println(dataLoss.dataLoss().toString());
    }
}
