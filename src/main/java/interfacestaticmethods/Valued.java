package interfacestaticmethods;

import java.util.List;

public interface Valued {
    double getValue();

    static double totalValue(List<Valued> valueds) {
        double sumElements = 0.0;
        for (Valued valued : valueds){
            sumElements += valued.getValue();
        }
        return sumElements;
    }
}
