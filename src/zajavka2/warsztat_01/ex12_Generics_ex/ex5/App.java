package zajavka2.warsztat_01.ex12_Generics_ex.ex5;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,5,11,17,105);
        List<Long> longList = Arrays.asList(1L,2L,3L,5L,11L,17L,105L);
        List<Double> doubleList = Arrays.asList(1.2,2.2,3.2,5.2,11.2,17.2,105.2);
        List<Float> floatList = Arrays.asList(1f,2f,3f,5f,11f,17f,105f);

        System.out.println(exerciseFive(integerList, 0, 17).orElse(null));
        System.out.println(exerciseFive(longList, 0L, 17L).orElse(null));
        System.out.println(exerciseFive(doubleList, 0.0, 17.0).orElse(null));
        System.out.println(exerciseFive(floatList, 0F, 17F).orElse(null));
    }

    public static<T extends Number> Optional<T> exerciseFive(List<T> list, T min, T max) {
        T tempMaxValue = null;

        for (T el : list) {
            if(el.doubleValue() >= min.doubleValue() && el.doubleValue() < max.doubleValue()) {
                if(Objects.isNull(tempMaxValue) || el.doubleValue() > tempMaxValue.doubleValue()) {
                    tempMaxValue = el;
                }
            }
        }

        return Optional.ofNullable(tempMaxValue);
    }
}
