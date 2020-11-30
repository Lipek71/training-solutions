package week06.d01;

public class SeparatedSumBack {
    private double sumPositive;
    private double sumNegative;

    public SeparatedSumBack(double sumPositive, double sumNegative) {
        this.sumPositive = sumPositive;
        this.sumNegative = sumNegative;
    }

    @Override
    public String toString() {
        return "SeparatedSumBack{" +
                "sumPositive=" + sumPositive +
                ", sumNegative=" + sumNegative +
                '}';
    }
}
