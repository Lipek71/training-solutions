package methodstructure.pendrives;

import java.util.List;

public class Pendrives {
    public Pendrive best(List<Pendrive> pendrives) {
        Pendrive pendriveBest = pendrives.get(0);
        for (int i = 1; i < pendrives.size(); i++) {
            if (1 == pendriveBest.comparePricePerCapacity(pendrives.get(i))) {
                pendriveBest = pendrives.get(i);
            }
        }
        return pendriveBest;
    }

    public Pendrive cheapest(List<Pendrive> pendrives) {
        Pendrive pendriveCheapest = pendrives.get(0);
        for (int i = 1; i < pendrives.size(); i++) {
            if (pendrives.get(i).cheaperThan(pendriveCheapest)){
                pendriveCheapest = pendrives.get(i);
            }
        }
        return pendriveCheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity) {
        for (Pendrive pendrive : pendrives) {
            if (pendrive.getCapacity() == capacity) {
                pendrive.risePrice(percent);
            }
        }
    }
}
