abstract class Parent1 {// abstract class ka object nahi banaya jayega
    abstract public void fun2(int a);// if you declare abstract method to abstract class banayi jayegi

    static void run() {
        System.out.println("Parent1");
    }
}

class Child1 extends Parent1 {
    public void fun2(int a)// agar abstract class ko inherit karni hai to ya use abstract karo ya abstract
                           // method ko override karo
    {
        System.out.println("Child");
    }
}

class Child2 extends Parent1 {
    public void fun2(int a) {
        System.out.println("Child2");
    }

    public static void main(String[] args) {
        Child1 c = new Child1();
        c.fun2(2);
        Child2 c2 = new Child2();
        c2.fun2(2);

        // Parent1 p1 = new Parent1();
        // p1.fun2();
        Parent1.run();
    }
}
