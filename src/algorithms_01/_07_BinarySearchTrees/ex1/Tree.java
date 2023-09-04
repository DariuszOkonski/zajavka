package algorithms_01._07_BinarySearchTrees.ex1;

public interface Tree<T> {
    void insert(T data);
    void remove(T data);
    void traversal(); // in-order traversal yields the natural ordering
    T getMin();
    T getMax();
}

