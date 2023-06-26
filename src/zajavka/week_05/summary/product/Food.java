package zajavka.week_05.summary.product;

import zajavka.week_05.summary.person.ConsumingMan;
import zajavka.week_05.summary.person.ProducingMan;

public abstract class Food {
    private final String name;
    private final ProducingMan producingMan;
    private final ConsumingMan consumingMan;

    public Food(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        this.name = name;
        this.producingMan = producingMan;
        this.consumingMan = consumingMan;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", producingMan=" + producingMan +
                ", consumingMan=" + consumingMan +
                '}';
    }
}
