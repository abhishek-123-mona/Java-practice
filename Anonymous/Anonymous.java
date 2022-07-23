public class Anonymous {
    void sum() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Anonymous a = new Anonymous();
        a.sum();
    }
}

// Runnable r = new Runnable() {
// public void run() {
// while (true) {
// System.out.println("Good morning");
// try {
// Thread.sleep(200);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// }
// };
// Thread t = new Thread(r);
// t.start();
// }

// }
