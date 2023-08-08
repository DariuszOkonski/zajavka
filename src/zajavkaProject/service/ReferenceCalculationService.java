package zajavkaProject.service;

import zajavkaProject.model.InputData;
import zajavkaProject.model.MortgageReference;

public interface ReferenceCalculationService {

    MortgageReference calculate(InputData inputData);
}

