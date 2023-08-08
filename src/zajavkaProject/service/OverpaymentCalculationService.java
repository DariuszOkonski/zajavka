package zajavkaProject.service;

import zajavkaProject.model.InputData;
import zajavkaProject.model.Overpayment;

import java.math.BigDecimal;

public interface OverpaymentCalculationService {
    Overpayment calculate(BigDecimal rateNumber, InputData inputData);
}

