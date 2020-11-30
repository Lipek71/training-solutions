package primitivetypes;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveTypes {
    public String toBinaryString(int n){
        int binary;
        binary = n;
        Integer binaryPosition;
        String binaryConvertedNumber = "";
        List<Integer> binaryCode= new ArrayList<>();
        do {
            binaryPosition = binary % 2;
            binary = binary / 2;
            binaryCode.add(binaryPosition);
        }while (binary > 0);
        for(int i = 32-binaryCode.size(); i > 0; --i){
            binaryConvertedNumber=binaryConvertedNumber +"0";
        }
        for(int i = binaryCode.size(); i > 0; --i){
            System.out.print(binaryCode.get(i-1));

            binaryConvertedNumber=binaryConvertedNumber + binaryCode.get(i-1).toString();
        }
        System.out.println();
        return binaryConvertedNumber;

    }
}
