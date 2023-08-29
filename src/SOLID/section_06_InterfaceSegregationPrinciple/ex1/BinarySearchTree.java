package SOLID.section_06_InterfaceSegregationPrinciple.ex1;

public class BinarySearchTree implements Tree {
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
}
