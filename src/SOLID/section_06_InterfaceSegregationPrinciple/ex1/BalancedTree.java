package SOLID.section_06_InterfaceSegregationPrinciple.ex1;

public class BalancedTree implements RotationTree {
    @Override
    public void insert() {
        System.out.println("Inserting a new item");
    }

    @Override
    public void delete() {
        System.out.println("Removing a given item...");
    }

    @Override
    public void traverse() {
        System.out.println("In-order traverse in 0(N)");
    }

    @Override
    public void leftRotation() {
        System.out.println("Left rotation...");
    }

    @Override
    public void rightRotation() {
        System.out.println("Right rotation...");
    }
}
