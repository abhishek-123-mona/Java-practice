//it is normal program and it is not generic because it is not generic  
// public class Generic {
//     public void printArray(String[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }

//     public void printArray(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }

//     public static void main(String[] args) {

//         Generic g = new Generic();
//         String[] strArr = { "Hello", "World" };
//         int[] intArr = { 1, 2, 3, 4, 5 };
//         g.printArray(strArr);
//         g.printArray(intArr);
//     }

// }
// here we are using generic method to print array of any type
public class Generic {
    public <E> void printArray(E[] arr) {
        for (E x : arr) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        Generic g = new Generic();
        String strArr[] = new String[] { "Hello", "World" };
        Integer intArr[] = { 1, 2, 3, 4, 5 };
        g.printArray(strArr);
        g.printArray(intArr);

    }

}