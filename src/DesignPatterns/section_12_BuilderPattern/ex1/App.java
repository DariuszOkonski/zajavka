package DesignPatterns.section_12_BuilderPattern.ex1;

public class App {
    public static void main(String[] args) {
        Person person = new Person.Builder("Kevin", "kevin@gmail.com")
                .setAge(15)
                .setAddress("Hudson Road")
                .build();

        System.out.println(person);
    }
}

