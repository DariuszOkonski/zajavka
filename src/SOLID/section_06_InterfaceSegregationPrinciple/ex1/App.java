package SOLID.section_06_InterfaceSegregationPrinciple.ex1;

public class App {
    public static void main(String[] args) {
        Tree tree1 = new BinarySearchTree();
        tree1.insert();
        tree1.delete();
        tree1.traverse();
        System.out.println("===============");

        RotationTree tree2 = new BalancedTree();
        tree2.insert();
        tree2.delete();
        tree2.traverse();
        tree2.leftRotation();
        tree2.rightRotation();
    }
}
