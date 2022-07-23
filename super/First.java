class First1 {
    int x;

    public void f1() {
        System.out.println("start......");

    }
}

class Second extends First1 {
    int x;

    public void f1() {
        System.out.println("start......");
        super.f1();
    }

    public void f2() {
        x = 2;
        super.x = 10;
        System.out.println(super.x);

    }
}

public class First {

    public static void main(String args[]) {
        Second sc = new Second();
        sc.f1();
        sc.f2();

    }

}
