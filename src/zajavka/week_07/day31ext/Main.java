package zajavka.week_07.day31ext;

public class Main {
    public static void main(String[] args)  {
        Driver andrzej = new Driver(36);
        Driver ryszard = new Driver(16);

        try {
            ryszard.setAge(17);
            andrzej.setAge(37);
        } catch (DriverToYoungException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(andrzej.getAge());
    }
}

