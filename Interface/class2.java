interface Interface1 {
    int x = 10;

    public void method1();

    public void method2();

    static void run() {
        System.out.println("Parent1");
    }

}

class Class1 implements Interface1 {
    public void method1() {
        System.out.println("Method1");
    }

    public void method2() {
        System.out.println("Method2");
    }
}

class class2 {
    public static void main(String[] args) {
        Class1 c = new Class1();
        c.method1();
        c.method2();
        Interface1.run();
    }
}