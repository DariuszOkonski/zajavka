package SOLID.section_07_DependencyInversion.ex2;

public class Skrill implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Paying with Skrill...");
    }
}
