package week_01.day4;

public class MyClass {
    public int x;
    public int y;
    public int z;

    public MyClass(int x) {
        this(x, 10);
    }

    public MyClass(int x, int y) {
        this(x, y, 100);
    }

    public MyClass(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
