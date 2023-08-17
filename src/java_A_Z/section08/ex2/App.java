package java_A_Z.section08.ex2;

public class App {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            System.out.println("outer for lop i index: " + i);
            for (int j = 0; j < 5; j++ ){
                System.out.println("i value: " + i + " - j value: " + j);
            }
        }
    }
}
