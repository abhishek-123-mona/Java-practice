//threading first program 
public class First implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("First");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        First f = new First();
        Thread t = new Thread(f);
        t.start();
    }
}
