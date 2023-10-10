package zajavka2.warsztat_02.day_06;

public class Main {
    public static void main(String[] args) {
        ITraveller traveller = dest -> System.out.println("I am travelling to: " + dest);

        traveller.travel("Plock");
    }
}

