package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Ship> ships = new ArrayList<>();
    private int waitingPersons;
    private int waitingCargo;

    public void addShip(Ship ship){
        ships.add(ship);
    }

    public int getWaitingPersons() {
        return waitingPersons;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }

    public void loadShip(int numberOfPersons, int cargoWeight) {
        int remainderPassengers = numberOfPersons;
        int remainderCargo = cargoWeight;
        for (Ship actualShip : ships) {
            if (actualShip instanceof CanCarryPassengers) {
                if (remainderPassengers != 0) {
                    remainderPassengers = ((CanCarryPassengers) actualShip).loadPassenger(remainderPassengers);
                }
            }
            if (actualShip instanceof CanCarryGoods) {
                if (remainderCargo != 0) {
                    remainderCargo = ((CanCarryGoods) actualShip).loadCargo(remainderCargo);
                }
            }
        }
        waitingPersons = remainderPassengers;
        waitingCargo = remainderCargo;
    }
}
