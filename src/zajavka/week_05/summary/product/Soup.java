package zajavka.week_05.summary.product;

import zajavka.week_05.summary.person.ConsumingMan;
import zajavka.week_05.summary.person.ProducingMan;

public class Soup extends Food {
    public Soup(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(name, producingMan, consumingMan);
    }
}
