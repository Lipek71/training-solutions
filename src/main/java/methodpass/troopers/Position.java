package methodpass.troopers;

public class Position {
    private double posX;
    private double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double distanceFrom(Position position){
        return Math.sqrt((getPosX() - position.posX)*(getPosX() - position.posX) +(getPosY() - position.posY)*(getPosY() - position.posY));
    }
}
