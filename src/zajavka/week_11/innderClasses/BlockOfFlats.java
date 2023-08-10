package zajavka.week_11.innderClasses;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BlockOfFlats {
    private List<Flat> flats;

    public BlockOfFlats() {
    }

    public BlockOfFlats(List<BigDecimal> areas) {
        List<Flat> flats = new ArrayList<>();
        for (BigDecimal area : areas) {
            flats.add(new Flat(area));
        }
        this.flats = flats;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public static class Flat {
        private BigDecimal area;

        public Flat(BigDecimal area) {
            this.area = area;
        }

        public BigDecimal getArea() {
            return area;
        }

        @Override
        public String toString() {
            return "Flat{" +
                    "area=" + area +
                    '}';
        }
    }
}
