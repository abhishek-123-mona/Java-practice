public class Insertion {
        public static void main(String[] args)
        {
            int[] arr=new int[100];
            int i,x,pos,n=10;
            for( i=0;i<10;i++)`
            {
                arr[i]=i+1;
            
            }
            for( i=0;i<n;i++)
            {
                System.out.print(arr[i]);

              

            }
            System.out.println("");

            x=50;
            pos=5;
            n++;
            for( i=n-1;i>=pos;i--){
                arr[i]=arr[i-1];
            }
            arr[pos-1]=x;
            for(i=0; i<n; i++)
            {
                System.out.print(arr[i]);
            }
        }
}
