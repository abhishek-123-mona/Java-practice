public class This {
    int i, j, k; // here i,j,k instance variables

    void set(int i, int j, int k)// here i,j,k are local variables This keyword is used to access instance
                                 // variables
    {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    // {
    // i=l;
    // j=p;
    // k=q;
    // }

    public static void main(String[] args) {
        This t = new This();
        t.set(10, 20, 30);
        System.out.println(t.i + " " + t.j + " " + t.k);
    }

}
