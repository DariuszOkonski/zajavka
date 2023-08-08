package zajavkaProject.service;

import zajavkaProject.model.InputData;
import zajavkaProject.model.Overpayment;
import zajavkaProject.model.Rate;
import zajavkaProject.model.RateAmounts;

public interface AmountsCalculationService {
    RateAmounts calculate(InputData inputData, Overpayment overpayment);

    RateAmounts calculate(InputData inputData, Overpayment overpayment, Rate previousRate);
}
