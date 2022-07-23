class A {
    public void f1(int x) {
        System.out.println("Class A");
    }
    public void f1(int x, int y) {
        System.out.println("Class B");
    }
}
public class B extends A {
   
public static void main(String[] args)
{
    B b = new B();
    b.f1(1);
    b.f1(1, 2);

}
}


