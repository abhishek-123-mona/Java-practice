import java.util.Scanner;
public class DoubleandMatch {
        public static void main(String[] args)
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
        System.out.println("Enter the number to be searched");
        int num = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==num)
            {
                num= arr[i]*2;
                System.out.print(arr[i]);
            }
            else{
                System.out.print(num);
            }

        }
        System.out.print(num);
}
}
