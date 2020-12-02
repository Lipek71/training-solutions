package immutable.satellite;

import java.util.ArrayList;
import java.util.List;

public class Satellite {
    private CelestialCoordinates celestialCoordinates;
    private String registerIdent;
    private int celestialCordinatesModifyX;
    private int celestialCordinatesModifyY;
    private int celestialCordinatesModifyZ;

    public Satellite(CelestialCoordinates celestialCoordinates, String registerIdent) {
        this.celestialCoordinates = celestialCoordinates;
        if(!isEmpty(registerIdent)){
            this.registerIdent = registerIdent;
            celestialCordinatesModifyX = celestialCoordinates.getX();
            celestialCordinatesModifyY = celestialCoordinates.getY();
            celestialCordinatesModifyZ = celestialCoordinates.getZ();
        }
    }

    public String getRegisterIdent() {
        return registerIdent;
    }

    public int getCelestialCordinatesModifyX() {
        return celestialCordinatesModifyX;
    }

    public int getCelestialCordinatesModifyY() {
        return celestialCordinatesModifyY;
    }

    public int getCelestialCordinatesModifyZ() {
        return celestialCordinatesModifyZ;
    }

    public void modifyDestination(CelestialCoordinates diff){
        celestialCordinatesModifyX += diff.getX();
        celestialCordinatesModifyY += diff.getY();
        celestialCordinatesModifyZ += diff.getZ();



    }
    public String toString(){
        return getRegisterIdent() + ": CelestialCoordinates: x=" +  celestialCordinatesModifyX + ", y=" + celestialCordinatesModifyY
                + ", z=" + celestialCordinatesModifyZ;
    }

    private boolean isEmpty(String str){
        if(str==null || str.isBlank()){
            throw new IllegalArgumentException("Register ident must not be empty!");
        }
        return true;
    }
}
