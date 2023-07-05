package zajavka.week_07.day31ext;

public class Main {
    public static void main(String[] args)  {
        Driver andrzej = new Driver(36);
        Driver ryszard = new Driver(16);

        try {
            andrzej.setAge(37);
            ryszard.setAge(17);
        } catch (DrivingException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

