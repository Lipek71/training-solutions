package ioreadwritebytes.temperatures;

public class Temperatures {
    private byte[] temperatures = new byte[365];

    public Temperatures(byte[] temperatures) {
        this.temperatures = temperatures;
    }

    public byte[] getTemperatures() {
        return temperatures;
    }

    public double getYearAverage(){
        int tempSum = 0;
        for(int i=0; i < 365; i++){
            tempSum += temperatures[i];
        }

        return (double) tempSum / 365;
    }

    public double getMonthAverage(){
        int tempSum = 0;
        for(int i=335; i < 365; i++){
            System.out.println(i + ", " + temperatures[i]);
            tempSum += temperatures[i];
        }

        return (double) tempSum / 30;
    }
}
