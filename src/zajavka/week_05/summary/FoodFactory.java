package zajavka.week_05.summary;

import zajavka.week_05.summary.person.Consumer;
import zajavka.week_05.summary.person.ConsumingMan;
import zajavka.week_05.summary.person.Producer;
import zajavka.week_05.summary.person.ProducingMan;
import zajavka.week_05.summary.product.Food;

public class FoodFactory {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        foodFactory.run();
    }

    private void run() {
        ProducingMan[] producingPeople = new ProducingMan[]{
                new Producer("Alicja", "Zupowa"),
                new Producer("Krzysztof", "Ciastkarski")
        };

        ConsumingMan[] consumingPeople = new ConsumingMan[] {
                new Consumer("Rafał", "Pożeracz", "chocolate"),
                new Consumer("Angelika", "Zajadacz", "soup")
        };

        Food[] foods = new Food[producingPeople.length + consumingPeople.length];

        int iterator = 0;
        for (ProducingMan producingPerson : producingPeople) {
            for (ConsumingMan consumingPerson : consumingPeople) {
                Food food = producingPerson.produce(consumingPerson.getExpectations(), consumingPerson);
                foods[iterator] = food;
                iterator++;
            }
        }

        System.out.println("Printing food");
        for (Food food : foods) {
            System.out.println(food);
        }
    }
}
