package zajavka.week_09.day45ext;

public class Animal implements Jumpable {
    @Override
    public boolean canJump(String s) {
        System.out.println("canJump invoked");
        return s.contains("jump");
    }
}
