
package lover2;

public class Second2 extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("bunny hey" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

    }
}
