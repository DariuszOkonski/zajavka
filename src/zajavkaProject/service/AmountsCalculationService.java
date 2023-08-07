package zajavkaProject.service;

import zajavkaProject.model.InputData;
import zajavkaProject.model.Rate;
import zajavkaProject.model.RateAmounts;

public interface AmountsCalculationService {
    RateAmounts calculate(InputData inputData);

    RateAmounts calculate(InputData inputData, Rate previousRate);
}
