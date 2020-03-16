package cm;

import java.math.BigDecimal;
import java.util.ArrayList;

public class VisitorRate extends Rate {
    public VisitorRate(BigDecimal normalRate, BigDecimal reducedRate, ArrayList<Period> reducedPeriods, ArrayList<Period> normalPeriods) {
        super(CarParkKind.VISITOR, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    @Override
    public BigDecimal calculate(Period periodStay) {

        BigDecimal payment = calculateTotalPayment(periodStay);

        BigDecimal basePayment = new BigDecimal(8.0);
        BigDecimal reduction = new BigDecimal(0.5);
        if(payment.compareTo(basePayment) > 0)
            return payment.subtract(basePayment).multiply(reduction);
        return new BigDecimal(0);
    }
}
