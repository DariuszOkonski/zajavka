package zajavkaProject.service;

import zajavkaProject.model.Rate;
import zajavkaProject.model.Summary;

import java.util.List;

public interface SummaryService {
    Summary calculate(List<Rate> rates);
}
