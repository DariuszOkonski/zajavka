package zajavka.week_04.day17ext;

import java.util.Objects;

public class Calculator {
    public String name;

    public Calculator(String model) {
        this.name = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Calculator that = (Calculator) o;

        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
