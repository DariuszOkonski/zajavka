package zajavkaProject.service;

import zajavkaProject.model.InputData;
import zajavkaProject.model.MortgageResidual;
import zajavkaProject.model.Rate;
import zajavkaProject.model.RateAmounts;

public interface ResidualCalculationService {
    MortgageResidual calculate(RateAmounts rateAmounts, InputData inputData);

    MortgageResidual calculate(RateAmounts rateAmounts, Rate previousRate);
}
