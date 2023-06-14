package zajavka.week_04.day17;

import java.util.Objects;

class Car {
    private String company;
    private String model;
    private int productionYear;

    public Car(String company, String model, int productionYear) {
        this.company = company;
        this.model = model;
        this.productionYear = productionYear;
    }

//    public boolean equals(Object obj) {
//        if(obj == null) {
//            return false;
//        }
//
//        if(obj instanceof Car) {
//            Car otherCar = (Car) obj;
//            return this.company.equals(otherCar.company) && this.model.equals(otherCar.model) && this.productionYear == otherCar.productionYear;
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Car car = (Car) o;

//        if (productionYear != car.productionYear) {
//            return false;
//        }
        if (!Objects.equals(company, car.company)) {
            return false;
        }
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        int result = company != null ? company.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }
}

