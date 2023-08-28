package SOLID.section_04_OpenClosedPrinciple.ex2;

public class App {
    public static void main(String[] args) {
        SorterProcessor processor = new SorterProcessor();
        processor.process(new InsertionSort());
        processor.process(new SelectionSort());
        processor.process(new MergeSort());
    }
}

