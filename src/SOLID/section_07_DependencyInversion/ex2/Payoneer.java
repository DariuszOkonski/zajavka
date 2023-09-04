package SOLID.section_07_DependencyInversion.ex2;

public class Payoneer implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Paying with Payoneer...");
    }
}

