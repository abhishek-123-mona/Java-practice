class Mydata2<T> {
    T i;

    public void add(T i1) {
        i = i1;
    }

    public T get() {
        return i;
    }
}

public class Mydata {

    public static void main(String[] args) {
        Mydata2<Integer> m = new Mydata2<Integer>();
        Mydata2<String> m1 = new Mydata2<String>();
        m.add(10);
        m1.add("Hello");
        System.out.println(m.get());
        System.out.println(m1.get());
    }
}
