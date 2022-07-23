class Runnable1 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i--) {
            System.out.println("tIK");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Runnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i--) {
            System.out.println("TOK");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Runnable3 {
    public static void main(String[] args) {
        Runnable1 r1 = new Runnable1();
        Runnable1 r3 = new Runnable1();

        Runnable2 r2 = new Runnable2();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t3.start();
        t1.start();
        t2.start();
    }
}
