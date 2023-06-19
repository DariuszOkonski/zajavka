package zajavka.week_05.day21;

public class Car {
    private String company;
    private String model;
    private int productionYear;

    private int[] array;

    public Car(String company, String model, int productionYear) {
        this.company = company;
        this.model = model;
        this.productionYear = productionYear;
    }

    public String getCompany() {
        return company == null ? "default" : this.company;
    }

    public String getModel() {
        return this.model == null ? "default" : this.model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int[] getArray() {
        return this.array == null ? new int[0] : this.array;
    }

    public void setCompany(String company) {
        if("brak".equals(company)) {
            System.out.println("No way mate!");
            return;
        }
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
