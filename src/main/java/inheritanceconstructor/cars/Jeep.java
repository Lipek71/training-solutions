package inheritanceconstructor.cars;

public class Jeep extends Car {
    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        if (extraFuel > extraCapacity) {
            throw new IllegalArgumentException("Auxiliary capacity is less than extra fuel!");
        }
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        super.modifyFuelAmount(fuel);
    }

    @Override
    public void drive(int km) {
        if(!isEnoughFuel(km)){
            throw new RuntimeException("Not enough fuel available!");
        }
        extraFuel -= km * getFuelRate() /100;
        if (extraFuel < 0){
            modifyFuelAmount(extraFuel);
            extraFuel = 0;
        }
    }

    @Override
    public boolean isEnoughFuel(int km) {
        return km/100 * getFuelRate() <= getFuel() + getExtraFuel() ? true : false;
    }

    @Override
    public double calculateRefillAmount() {
        return super.calculateRefillAmount() + getExtraCapacity() -getExtraFuel();
    }
}
