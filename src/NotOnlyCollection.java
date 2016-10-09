public class NotOnlyCollection {

    public static void main(String args[]) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello anonymous class");
            }
        }).start();

        new Thread(() -> System.out.println("Hello lambda")).start();
    }
}
