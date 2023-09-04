package SOLID.section_07_DependencyInversion.ex2;

public class PaymentController {
    private PaymentMethod paymentMethod;

    public PaymentController() {
    }

    public void pay() {
        this.paymentMethod.pay();
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}

