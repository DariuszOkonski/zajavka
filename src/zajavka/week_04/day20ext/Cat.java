package zajavka.week_04.day20ext;

class Cat extends Animal {
    private String name = "Jurek";

    {
        this.name = "Tasza";
    }

    public Cat(String name) {
        this.name = name;
    }
}
