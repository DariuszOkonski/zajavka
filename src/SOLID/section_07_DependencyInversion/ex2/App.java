package SOLID.section_07_DependencyInversion.ex2;

public class App {
    public static void main(String[] args) {
        WebStore webStore = new WebStore();
        webStore.purchaseItem();
    }
}

