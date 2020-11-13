package week03;

public class Operation {
    private int leftOperand;
    private int rightOperand;

    public Operation(String string){
        //string = "123+234";
        leftOperand = Integer.parseInt(string.substring(0,string.indexOf("+")));
        rightOperand = Integer.parseInt(string.substring(string.indexOf("+")+1,string.length()));
    }
    public int Result(Operation operation){
        return leftOperand + rightOperand;
    }
}
