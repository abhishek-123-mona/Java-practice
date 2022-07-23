package Practice;

public class First extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good morning");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class Second extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        First f = new First();
        Second s = new Second();
        f.start();
        s.start();
    }

}
