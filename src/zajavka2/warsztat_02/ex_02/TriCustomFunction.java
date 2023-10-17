package zajavka2.warsztat_02.ex_02;

@FunctionalInterface
public interface TriCustomFunction<T> {
    Integer calculate(String s, Integer i, T t);
}
