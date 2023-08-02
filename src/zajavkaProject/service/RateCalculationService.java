package zajavkaProject.service;

import zajavkaProject.model.InputData;
import zajavkaProject.model.Rate;

import java.util.List;

public interface RateCalculationService {
    List<Rate> calculate(final InputData inputData);
}

