package org.cleancode.notes.v2.ocp;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalMapper implements NumberMapper<BigDecimal>{
    @Override
    public BigDecimal map(Integer integer) {
        return BigDecimal.valueOf(integer).divide(BigDecimal.valueOf(3), MathContext.DECIMAL64);
    }
}
