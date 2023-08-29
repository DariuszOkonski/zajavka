package java_A_Z.section12.ex4;

public class App {
    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            void showMsg() {
                System.out.println("This is a message...");
            }
        };

        abstractClass.showMsg();

        AbstractInterface abstractInterface = new AbstractInterface() {
            @Override
            public void showMsg() {
                System.out.println("AbstractInterface showMsg");
            }

            @Override
            public void sendMessage() {
                System.out.println("AbstractInterface sendMessage");
            }
        };
        abstractInterface.showMsg();
        abstractInterface.sendMessage();
    }
}

