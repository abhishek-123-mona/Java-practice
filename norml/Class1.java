public class Class1 implements Runnable {
    public static void main(String[] args) {
        Class1 c = new Class1();
        Thread t = new Thread(c);
        t.start();
        System.out.println("dfsdf");
    }

}
