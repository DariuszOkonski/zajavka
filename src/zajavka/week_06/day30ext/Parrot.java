package zajavka.week_06.day30ext;

public class Parrot {
    public static String name;
    private String surname;

    static {
        name = "Statyczna Agata";
    }

    {
        name = "Niestatyczna Agata";
        surname = "I Hakuna Matata";
    }

    public Parrot() {
        System.out.println("Constructor 0 arguments");
    }

    public Parrot(String surname) {
        this.surname = surname;
        System.out.println("Constructor");
    }

    public String getName() {
        return surname;
    }
}
