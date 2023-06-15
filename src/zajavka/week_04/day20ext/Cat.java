package zajavka.week_04.day20ext;

class Cat extends Animal {

    private static String getJurek() {
        return "Jurek";
    }

    {
        this.name = "Tasza";
    }

    public Cat(String name) {
        this.name = name;
    }

    private String name = getJurek();
}
