import java.util.*;

class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            al.add(sc.next());
        }
        System.out.println("The elements are");
        for (int i = 0; i < n; i++) {
            System.out.println(al.get(i));
        }
    }
}
