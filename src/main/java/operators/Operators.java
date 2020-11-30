package operators;

public class Operators {
    public boolean isEven(int n){
        boolean isEven=false;
        if(n%2 != 1){
            isEven = true;
        }
        return isEven;
    }

    public String multiplyByPowerOfTwo(int number, int multiplayer){
        return Integer.toBinaryString(number << multiplayer);
    }
}
