package zajavka.week_07.day31ext;

public class Main {
    public static void main(String[] args)  {
        Driver andrzej = new Driver(36);
        Driver ryszard = new Driver(16);

        drive(ryszard, 17);
        drive(andrzej, 20);
    }

    private static void drive(Driver driver, int age) {
        try {
            driver.setAge(age);
        } catch (DriverToYoungException ex) {
            System.out.println(ex.getMessage());
        } catch (DrivingException ex) {
            System.out.println("some message");
        }
    }
}

