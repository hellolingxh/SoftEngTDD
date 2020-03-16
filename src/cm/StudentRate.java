package cm;

import java.math.BigDecimal;
import java.util.ArrayList;

public class StudentRate extends Rate {

    public StudentRate(BigDecimal normalRate, BigDecimal reducedRate, ArrayList<Period> reducedPeriods, ArrayList<Period> normalPeriods) {
        super(CarParkKind.STUDENT, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Override
    public BigDecimal calculate(Period periodStay) {
        if(periodStay == null)
            throw new IllegalArgumentException("The argument periodStay cannot be null.");

        int normalRateHours = periodStay.occurences(getNormal());
        int reducedRateHours = periodStay.occurences(getReduced());
        BigDecimal payment = (this.getHourlyNormalRate().multiply(BigDecimal.valueOf(normalRateHours))).add(
                this.getHourlyReducedRate().multiply(BigDecimal.valueOf(reducedRateHours)));

        BigDecimal basePayment = new BigDecimal(5.5);
        BigDecimal paymentOff = new BigDecimal(0.75);
        if(payment.compareTo(basePayment) > 0)
            return basePayment.add(payment.subtract(basePayment).multiply(paymentOff));
        return payment;

    }
}
