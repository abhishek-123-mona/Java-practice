import lover2.Second2;

public class Second implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Abhishek is" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }

    public static void main(String[] args) {
        Second f = new Second();
        Thread t = new Thread(f);
        Second2 sc = new Second2();

        t.start();
        sc.start();
    }
}
