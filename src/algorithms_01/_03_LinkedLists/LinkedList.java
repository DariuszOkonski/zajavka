package algorithms_01._03_LinkedLists;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> root;
    private int numOfItems;

    @Override
    public void insert(T data) {
        if(root == null) {
            // this is the first item in the linked list
            this.root = new Node<>(data);
        } else {
            // we know that this is not the first item in the linked list
            insertBeginning(data);
        }
    }

    // we just have to update the references 0(1)
    private void insertBeginning(T data) {
        Node<T> newData = new Node<>(data);
        newData.setNextNode(this.root);
        this.root = newData;
    }

    // because we have to start with the root node
    // first we have to find the last node in 0(N)
    private void insertEnd(T data, Node<T> node) {
        // this is when we keep looking for the last node 0(N)
        if(node.getNextNode() != null) {
            insertEnd(data, node.getNextNode());
        } else {
            // we have found the last node
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {

    }

    @Override
    public void traverse() {
        if(root == null)
            return;

        Node<T> actualNode = root;
        while (actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.numOfItems;
    }
}
