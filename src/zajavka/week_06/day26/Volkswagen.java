package zajavka.week_06.day26;

public enum Volkswagen {
    PASSAT("white", 2020),
    GOLF("red", 2020),
    ARTEON("green", 2020),
    TIGUAN("blue", 2020),
    TUAREG("brown", 2020);

    private String colors;
    private int productionYear;

    Volkswagen(String colors, int productionYear) {
        this.colors = colors;
        this.productionYear = productionYear;
    }

    public String getColors() {
        return colors;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Volkswagen{" +
                "colors='" + colors + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
