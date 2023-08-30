package zajavka2.warsztat_01.ex3;

import java.util.Map;

public class GenericMethodMain<T> {
    private static Map<String, Vehicle> vehicleMap = Map.of("vehicle1", new Bike());

    public static void main(String[] args) {
        call1(new Bike());
        call2(new Bike());
        String bikeName = GenericMethodMain.<Bike>call3().getName();
        System.out.println(bikeName);
    }

    public static <T extends Vehicle> void call1(T element) {
        System.out.println(element);
    }

    public static <T extends Vehicle> T call2(T element) {
        System.out.println("return: " + element);
        return element;
    }

    public static <T> T call3() {
        return (T) vehicleMap.get("vehicle1");
    }

    static interface Vehicle {}
    static class Bike implements Vehicle{
        String getName() {
            return "bikename";
        }
    }

    static class Apple {}
}
