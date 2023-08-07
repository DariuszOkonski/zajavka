package zajavkaProject.service;

import zajavkaProject.model.InputData;
import zajavkaProject.model.TimePoint;

import java.math.BigDecimal;

public interface TimePointService {
    TimePoint calculate(BigDecimal rateNumber, InputData inputData);
}
