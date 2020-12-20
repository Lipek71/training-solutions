package exceptionmulticatch.converter;

public class BinaryStringConverter {
    public boolean[] binaryStringToBooleanArray(String booleanStr) {
        if (booleanStr == null)
            throw new NullPointerException("binaryString null");
        boolean[] booleanArray = new boolean[booleanStr.length()];
        for (int i = 0; i < booleanStr.length(); i++) {
            if (booleanStr.substring(i, i + 1).equals("0")) {
                booleanArray[i] = false;
            } else if (booleanStr.substring(i, i + 1).equals("1")) {
                booleanArray[i] = true;
            } else {
                throw new IllegalArgumentException("binaryString not valid");
            }
        }
        return booleanArray;
    }

    public String booleanArrayToBinaryString(boolean[] booleanArray) {
        if (booleanArray == null)
            throw new NullPointerException("booleans null");
        if (booleanArray.length == 0)
            throw new IllegalArgumentException("booleans size 0");
        StringBuilder booleanStr = new StringBuilder();
        if(booleanArray.length < 1){
            throw new IllegalArgumentException("booleans size 0");
        }
        for(int i=0; i < booleanArray.length; i++){
            if(booleanArray[i] == true){
                booleanStr.append("1");
            } else {
                booleanStr.append("0");
            }
        }
        return booleanStr.toString();
    }
}
