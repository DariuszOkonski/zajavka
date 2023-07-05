package zajavka.week_07.day31ext;

public class Main {
    public static void main(String[] args)  {
        try {
            exceptionalMethod();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void exceptionalMethod() throws Exception {
        throw new Exception("Message here");
    }
}
