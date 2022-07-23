import java.util.Scanner;
public class Shorting {
    public static void main(String[] args) {
        int i;
        int j;
        int temp=0;
        int[] arr;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array size.");
arr = new int[sc.nextInt()];
System.out.println("Enter the Element type");
        for (i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i<arr.length;i++) {
            for (j = i+1; j<arr.length; j++) {
                if(arr[j]<arr[i]) {
                    temp=arr[i];
                    arr[i]=arr[j];

                    arr[j]=temp;
                }
            }
        }
        for (i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]);
        }
    }
}
