package immutable.satellite;

public class Satellite {
    private CelestialCoordinates celestialCoordinates;
    private String registerIdent;
    private int celestialCordinatesModifyX;
    private int celestialCordinatesModifyY;
    private int celestialCordinatesModifyZ;

    public Satellite(CelestialCoordinates celestialCoordinates, String registerIdent) {
        this.celestialCoordinates = celestialCoordinates;
        if (registerIdent == null || registerIdent.isBlank()) {
            throw new IllegalArgumentException("Register ident must not be empty!");
        } else {
            this.registerIdent = registerIdent;
            celestialCordinatesModifyX = celestialCoordinates.getX();
            celestialCordinatesModifyY = celestialCoordinates.getY();
            celestialCordinatesModifyZ = celestialCoordinates.getZ();
        }
    }

    public String getRegisterIdent() {
        return registerIdent;
    }

    public void modifyDestination(CelestialCoordinates diff) {
        this.celestialCordinatesModifyX = celestialCoordinates.getX() + diff.getX();
        this.celestialCordinatesModifyY = celestialCoordinates.getY() + diff.getY();
        this.celestialCordinatesModifyZ = celestialCoordinates.getZ() + diff.getZ();
    }

    public String toString() {
        return getRegisterIdent() + ": CelestialCoordinates: x=" + celestialCordinatesModifyX + ", y=" + celestialCordinatesModifyY
                + ", z=" + celestialCordinatesModifyZ;
    }
}
