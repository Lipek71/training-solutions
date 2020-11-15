package primitivetypes;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveTypes {
    public String toBinaryString(int n){
        int binary;
        binary = n;
        Integer binaryPosition;
        String binaryConvertedNumber = null;
        List<Integer> binaryCode= new ArrayList<>();
        do {
            binaryPosition = binary % 2;
            binary = binary / 2;
            binaryCode.add(binaryPosition);
        }while (binary > 0);
        for(int i = binaryCode.size(); i > 0; --i){
            System.out.println(binaryCode.get(i-1));
            binaryConvertedNumber=binaryConvertedNumber + binaryCode.get(i-1).toString();
        }
        //for(int i = 0; i < binaryCode.size(); i++){
        //    System.out.println(binaryCode.get(i));
        //}
        //for(Integer item: binaryCode ){
        //    System.out.println(item.byteValue());
        //}
        return binaryConvertedNumber;
    }
}
