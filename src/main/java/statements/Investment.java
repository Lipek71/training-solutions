package statements;

public class Investment {
    private double cost;
    private long fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public long getFund() {
        return fund;
    }

    public void setFund(long fund) {
        this.fund = fund;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public double getYield(int days){
        return getFund() * getInterestRate() * days / 365 / 100;
    }

    public double close(int days){
        double total;
        total = isActive() ? getFund() + getFund() * getInterestRate() * days / 365 / 100 * 0.997 : 0.0;
        setActive(false);
        return total;
    }
}
