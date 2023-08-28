package java_A_Z.section12.ex2;

public class App {
    // Member Inner Class
    public static void main(String[] args) {
        OutsideClass outsideClass = new OutsideClass();
        OutsideClass.InnerClass innerClass = outsideClass.new InnerClass();
        innerClass.showMessage();
    }
}

