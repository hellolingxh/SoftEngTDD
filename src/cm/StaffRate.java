package cm;

import java.math.BigDecimal;
import java.util.ArrayList;

public class StaffRate extends Rate {

    public StaffRate(BigDecimal normalRate, BigDecimal reducedRate, ArrayList<Period> reducedPeriods, ArrayList<Period> normalPeriods) {
        super(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
}
