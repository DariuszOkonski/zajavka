package algorithms_01._06_Queues.ex2;

public class Task {
    private int id;

    public Task(int id) {
        this.id = id;
    }

    public void execute() {
        System.out.println("Executing task with id: " + this.id);
    }
}
