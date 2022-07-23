import java.util.Scanner;
public class Insertion2  {
    public static void main(String[] args)
    {
        int n,m,p;
        int i;

Scanner s = new Scanner(System.in);
System.out.println("Enter no element of arry");
n=s.nextInt();
        int[] arr=new int[n];
        int[] arr2=new int[n+1];

        for (i = 0; i<arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter index of new value to be inserted");
        m = s.nextInt();
        System.out.println("Enter  new value to be inserted");
        p= s.nextInt();
        for ( i = 0; i<n+1; i++) {
            if(i<m)
            {
                arr[i] = arr2[i];
            }
            else if (i==m){
                arr2[i] = arr[i-1]; 
            }
        }
       System.out.println("Elelmetnts sarar");
        for(i=0; i<n; i++)
        {
            System.out.print(arr[i]);
        }
    }
}
