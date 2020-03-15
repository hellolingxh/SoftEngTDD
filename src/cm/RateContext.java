package cm;

import java.math.BigDecimal;

public class RateContext {

    private Rate rate;

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public BigDecimal calculate(Period periodStay) {
        return this.rate.calculate(periodStay);
    }
}
