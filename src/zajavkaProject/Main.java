package zajavkaProject;

import zajavkaProject.model.InputData;
import zajavkaProject.model.MortgageResidual;
import zajavkaProject.model.RateAmounts;
import zajavkaProject.model.TimePoint;
import zajavkaProject.service.*;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        InputData inputData = new InputData()
                .withAmount(new BigDecimal("300000"));

        PrintingService printingService = new PrintingServiceImpl();
        RateCalculationService rateCalculationService = new RateCalculationServiceImpl(
                new TimePointServiceImpl(),
                new AmountsCalculationServiceImpl(),
                new ResidualCalculationServiceImpl()
        );

        MortgageCalculationService mortgageCalculationService = new MortgageCalculationServiceImpl(
                printingService,
                rateCalculationService
        );
        mortgageCalculationService.calculate(inputData);
    }
}
