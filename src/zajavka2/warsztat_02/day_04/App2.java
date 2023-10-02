package zajavka2.warsztat_02.day_04;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App2 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat("Mrukson");
        Method[] methods = cat.getClass().getDeclaredMethods();
        System.out.println(methods[0].invoke(cat));

    }

    static class Cat {
        private final String name;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
