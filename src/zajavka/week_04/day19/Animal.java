package zajavka.week_04.day19;

class Animal {
    private String name;

//    public Animal() {
//        System.out.println("Animal created");
//    }
    public Animal(int i, String name) {
        System.out.println("Animal created: " + i);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}


