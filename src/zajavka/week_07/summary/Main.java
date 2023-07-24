package zajavka.week_07.summary;

public class Main {
    public static void main(String[] args) {
        User user1 = null;
        try {
            user1 = new User(14);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if(user1 == null) {
                user1 = new User(100);
            }
        }

        System.out.println(user1);

//        System.out.println("Printing Before");
//
//        try {
//            someOtherMethod();
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        System.out.println("Printing After");
    }

    private static void someOtherMethod() throws RuntimeException {
        throw new RuntimeException("Some error");
    }
}

