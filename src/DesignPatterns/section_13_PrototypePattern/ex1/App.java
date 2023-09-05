package DesignPatterns.section_13_PrototypePattern.ex1;

public class App {
    public static void main(String[] args) {
        Shape square = new Square(10, 5);
        square.draw();

        Shape squareClone = square.cloneObject();
        squareClone.draw();
    }
}

