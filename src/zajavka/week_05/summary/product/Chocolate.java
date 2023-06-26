package zajavka.week_05.summary.product;

import zajavka.week_05.summary.person.ConsumingMan;
import zajavka.week_05.summary.person.ProducingMan;

public class Chocolate extends Food {
    public Chocolate(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(name, producingMan, consumingMan);
    }
}
