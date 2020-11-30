package typeconversion.whichtype;

import java.util.ArrayList;
import java.util.List;

public class WhichType {
    public List<Type> whichType(String number){
        List<Type> typeList = new ArrayList<>();
        if (Long.parseLong(number) >= Type.BYTE.getMin() && Long.parseLong(number) <= Type.BYTE.getMax()){
            typeList.add(Type.BYTE);
        }
        if (Long.parseLong(number) >= Type.SHORT.getMin() && Long.parseLong(number) <= Type.SHORT.getMax()){
            typeList.add(Type.SHORT);
        }
        if (Long.parseLong(number) >= Type.INT.getMin() && Long.parseLong(number) <= Type.INT.getMax()){
            typeList.add(Type.INT);
        }
        return typeList;
    }
}
