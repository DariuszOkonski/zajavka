package SOLID.section_07_DependencyInversion.ex2;

public class WebStore {
    private PaymentController controller;

    public WebStore() {
        this.controller = new PaymentController();
        this.controller.setPaymentMethod(new Skrill());
    }

    public void purchaseItem() {
        this.controller.pay();;
    }

}

