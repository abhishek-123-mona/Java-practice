// public class JaggedArray {
//     public static void main(String[] args) {
//         int[][] jagged = new int[3][];
//         jagged[0] = new int[2];
//         jagged[1] = new int[3];
//         jagged[2] = new int[4];
//         jagged[0][0] = 1;
//         jagged[0][1] = 2;
//         jagged[1][0] = 3;
//         jagged[1][1] = 4;
//         jagged[1][2] = 5;
//         jagged[2][0] = 6;
//         jagged[2][1] = 7;
//         jagged[2][2] = 8;
//         jagged[2][3] = 9;

//         for (int i = 0; i < jagged.length; i++) {
//             for (int j = 0; j < jagged[i].length; j++) {
//                 System.out.print(jagged[i][j] + " ");
//             }
//             System.out.println();
//         }

//     }
// }
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = s1.nextInt();
        int[][] jagged = new int[row][];
        for (int i = 0; i < row; i++) {
            System.out.println("Enter the number of columns");
            int col = s1.nextInt();
            jagged[i] = new int[col];
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the element");
                jagged[i][j] = s1.nextInt();
            }
        }
        System.out.println("The jagged array is");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}