package zajavka2.warsztat_02.day_08;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> optionalInteger = Optional.of(new Ship())
                .map(ship -> ship.gimmeModel(ship));

        Optional<Ship> titanic = Optional.of("Titanic").map(Ship::new);
    }
}