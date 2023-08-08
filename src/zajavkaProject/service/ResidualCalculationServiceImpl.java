package zajavkaProject.service;

import zajavkaProject.model.InputData;
import zajavkaProject.model.MortgageResidual;
import zajavkaProject.model.Rate;
import zajavkaProject.model.RateAmounts;

import java.math.BigDecimal;

public class ResidualCalculationServiceImpl implements ResidualCalculationService {

    @Override
    public MortgageResidual calculate(RateAmounts rateAmounts, InputData inputData) {
        BigDecimal residualAmount = inputData.getAmount().subtract(rateAmounts.getCapitalAmount()).max(BigDecimal.ZERO);
        BigDecimal residualDuration = inputData.getMonthsDuration().subtract(BigDecimal.ONE);

        return new MortgageResidual(residualAmount, residualDuration);
    }

    @Override
    public MortgageResidual calculate(RateAmounts rateAmounts, Rate previousRate) {
        MortgageResidual residual = previousRate.getMortgageResidual();

        BigDecimal residualAmount = residual.getAmount().subtract(rateAmounts.getCapitalAmount()).max(BigDecimal.ZERO);
        BigDecimal residualDuration = residual.getDuration().subtract(BigDecimal.ONE);

        return new MortgageResidual(residualAmount, residualDuration);
    }
}
