package cm;

import java.math.BigDecimal;
import java.util.ArrayList;

public class StaffRate extends Rate {

    public StaffRate(BigDecimal normalRate, BigDecimal reducedRate, ArrayList<Period> reducedPeriods, ArrayList<Period> normalPeriods) {
        super(CarParkKind.STAFF, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }


    @Override
    public BigDecimal calculate(Period periodStay) {
        if(periodStay == null)
            throw new IllegalArgumentException("The argument periodStay cannot be null.");

        int normalRateHours = periodStay.occurences(getNormal());
        int reducedRateHours = periodStay.occurences(getReduced());
        BigDecimal payment = (this.getHourlyNormalRate().multiply(BigDecimal.valueOf(normalRateHours))).add(
                this.getHourlyReducedRate().multiply(BigDecimal.valueOf(reducedRateHours)));

        BigDecimal maxPayment = new BigDecimal(16.0);
        if(payment.compareTo(maxPayment) > 0)
            return maxPayment;
        return payment;
    }
}
