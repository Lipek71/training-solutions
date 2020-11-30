package enumtype.unit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnitConverterMain {
    public static void main(String[] args) {
        UnitConverter unitConverter = new UnitConverter();

        System.out.println(unitConverter.convert(new BigDecimal(1000), LengthUnit.CM, LengthUnit.CM));
        System.out.println(unitConverter.convert(new BigDecimal(10), LengthUnit.YARD, LengthUnit.CM));
        System.out.println(unitConverter.convert(new BigDecimal(10000), LengthUnit.MM, LengthUnit.M));
        System.out.println(unitConverter.convert(new BigDecimal(1), LengthUnit.FOOT, LengthUnit.CM));
        System.out.println(unitConverter.convert(new BigDecimal(17), LengthUnit.INCH, LengthUnit.MM));

        System.out.println(Arrays.toString(LengthUnit.values()));
        System.out.println(unitConverter.siUnits());

        List<LengthUnit> lengthUnits = new ArrayList<>();
        lengthUnits.add(LengthUnit.CM);
        System.out.println(lengthUnits.get(0).siUnits().toString());
    }
}

