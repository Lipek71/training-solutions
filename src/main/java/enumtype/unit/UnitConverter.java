package enumtype.unit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class UnitConverter {
    public BigDecimal convert(BigDecimal length, LengthUnit source, LengthUnit target){
        BigDecimal convertedLength;
        return length.multiply(new BigDecimal(source.getValueInMm())).divide(new BigDecimal(target.getValueInMm()), 4, RoundingMode.HALF_UP);
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
