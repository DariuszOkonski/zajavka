package zajavka.week_05.summary.person;

import zajavka.week_05.summary.product.Food;

public interface ConsumingMan {
    void consume(Food food);

    String getExpectations();
}
