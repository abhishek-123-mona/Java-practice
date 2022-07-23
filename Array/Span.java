import java.util.Scanner;

public class Span {
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
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The maximum element is " + max);

        System.out.println("The minimum element is " + min);
        int span = max - min;
        System.out.println("The span is " + span);

    }

}
