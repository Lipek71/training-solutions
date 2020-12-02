package immutable.satellite;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {
    List<Satellite> satellites = new ArrayList<>();
    public void registerSatellite(Satellite satellite) {
        isEmpty(satellite);
        this.satellites.add(satellite);
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent) {
        Satellite satellite = null;
        for(Satellite satellitePart : satellites){
            if(satellitePart.getRegisterIdent().equals(registerIdent)){
                satellite = satellitePart;
            }
        }
        if (satellite == null){
            throw new IllegalArgumentException("Satellite with the given registration cannot be found!" + registerIdent);
        }
        return satellite;
    }

    private boolean isEmpty(Satellite satellite) {
        if (satellite == null) {
            throw new NullPointerException("Parameter must not be null!");
        }
        return false;
    }

    @Override
    public String toString() {
        return satellites.toString();
    }
}
