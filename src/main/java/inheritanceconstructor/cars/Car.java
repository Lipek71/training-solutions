package inheritanceconstructor.cars;

public class Car {
    private double FuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if (fuel > tankCapacity) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        FuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelRate() {
        return FuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double fuel){
        this.fuel += fuel;
    }

    public void drive(int km){
        if(!isEnoughFuel(km)){
            throw new RuntimeException("Not enough fuel available!");
        }
        fuel -= km * getFuelRate() /100;
    }

    public boolean isEnoughFuel(int km){
        return km/100 * getFuelRate() <= getFuel() ? true : false;
    }

    public double calculateRefillAmount(){
        return getTankCapacity() - getFuel();
    }
}
