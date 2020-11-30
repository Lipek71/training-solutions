package enumtype.unit;

import java.util.ArrayList;
import java.util.List;

public enum LengthUnit {

    MM (1, true),
    CM (10, true),
    M (1000, true),
    YARD (914, false),
    FOOT (305, false),
    INCH (25, false);

    private final int valueInMm;
    private final boolean type;

    LengthUnit(int value, boolean type){
        this.valueInMm = value;
        this.type = type;
    }

    public int getValueInMm() {
        return valueInMm;
    }

    public boolean getType() {
        return type;
    }

    public List<LengthUnit> siUnits(){
        List<LengthUnit> siUnitsValues = new ArrayList<>();
        for(LengthUnit lengthUnit : LengthUnit.values()){
            if (lengthUnit.getType()){
                siUnitsValues.add((lengthUnit));
            }
        }
        return siUnitsValues;
    }
}
