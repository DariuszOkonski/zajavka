package zajavka.week_05.summary.person;

import zajavka.week_05.summary.product.Chocolate;
import zajavka.week_05.summary.product.Food;
import zajavka.week_05.summary.product.Sandwich;
import zajavka.week_05.summary.product.Soup;

public class Producer extends Person implements ProducingMan {

    public Producer(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void consume(Food food) {
        System.out.println("Producent consuming food: " + food);
    }

    @Override
    public String getExpectations() {
        return "no expectations";
    }

    @Override
    public Food produce(String productName, ConsumingMan consumingMan) {
        switch (productName) {
            case "chocolate":
                return new Chocolate(productName, this, consumingMan);
            case "soup":
                return new Soup(productName, this, consumingMan);
            default:
                return new Sandwich(productName, this, consumingMan);
        }
    }


}
