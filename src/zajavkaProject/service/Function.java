package zajavkaProject.service;

import zajavkaProject.model.Rate;

import java.math.BigDecimal;

public interface Function {
    BigDecimal calculate(Rate rate);
}
