class Bubble {
    public static void main(String [] args)
    {
        int arr[]={7,8,3,1,2};
    //bubble short
    for (int i = 0; i < arr.length-1; i++)
{
    for(int j = 0; j < arr.length;i++)
    {
        if(arr[j]>arr[j+1])
        {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;

        }
    }
}  
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
    }
}

