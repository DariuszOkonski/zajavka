package zajavka.week_04.summary;

class Dog {
    private String name;
    private String color;
    private boolean hasTail;

    public Dog() {
        System.out.println("Calling constructor");
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String color) {
        this(name);
        this.color = color;
    }

    public Dog(String name, String color, boolean hasTail) {
        this(name, color);
        this.hasTail = hasTail;
    }

    public void hau(int a) {

    }
    public void hau(String color) {
        System.out.println("Dog hauking: " + this.color);
    }
}