class Anonymous implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Good morning1");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

class Anonymous2 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Good morning2222");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Anonymous3 {
    public static void main(String[] args) {
        Anonymous f = new Anonymous();
        Anonymous2 s = new Anonymous2();
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("hskdfhksafhaks");

            }

        };

        Thread t3 = new Thread(r);
        t3.start();
    }
}
