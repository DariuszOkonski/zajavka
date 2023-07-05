package zajavka.week_07.day31ext;

public class Driver {
    private int age;

    public Driver(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws DrivingException {
        if (age < 18) {
            throw new DriverToYoungException("You cannot drive below 18 yo. Provided " + age + " years.");
        }

        if(age < 26) {
            throw new DrivingException("You have to little driving experience");
        }
        System.out.println("Setting driver's age to " + age);
        this.age = age;
    }
}
