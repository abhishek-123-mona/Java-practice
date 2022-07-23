import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = max; i >= 1; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
