package cm;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ManagementRate extends Rate {
    public ManagementRate(BigDecimal normalRate, BigDecimal reducedRate, ArrayList<Period> reducedPeriods, ArrayList<Period> normalPeriods) {
        super(CarParkKind.MANAGEMENT, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Override
    public BigDecimal calculate(Period periodStay) {

        BigDecimal payment = calculateTotalPayment(periodStay);

        BigDecimal basePayment = new BigDecimal(3.0);
        if(payment.compareTo(basePayment) < 0)
            return basePayment;
        return payment;
    }
}
