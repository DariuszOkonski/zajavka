package zajavka.week_07.summary;

public class User {
    private final int age;

    public User(int age) {
        if(age < 21) {
            throw new RuntimeException("Age is below 21, age = " + age);
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}
