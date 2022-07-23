//WE can creat thread two ways with using Runnable interface and Thread class.
//In Threading Java, we can create a thread by extending the Thread class.
class Thread1 extends Thread {
    public void run() {
        for (int i = 4; i < 5; i--) {
            System.out.println("Thread1: " + i);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 9; i < 10; i--) {
            System.out.println("Thread is running");
        }
    }
}

class Thread3 {
    public static void main(String[] args) {
        Thread1 t = new Thread1();
        Thread2 t2 = new Thread2();
        t.start();// start method is used to start the thread. It is a static method.you can call
                  // run methond directlly.
        t2.start();
    }

}
