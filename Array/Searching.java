import java.util.Scanner;
public class Searching {
    public static void main(String[] args) {
        int i;
        int n;
        int[] arr;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array size.");
arr = new int[sc.nextInt()];
System.out.println("Enter the Element type");
        for (i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of what you search");
        n=sc.nextInt();
        for (i = 0; i<arr.length;i++) {
            if(n==arr[i]) {
                System.out.println(i);
            }
            else {
                System.out.println("value not found again");
            }
        }
    }
}
