package zajavka.week_05.summary.person;

import zajavka.week_05.summary.product.Food;

public interface ProducingMan {
    Food produce(String productName, ConsumingMan consumingMan);
}

