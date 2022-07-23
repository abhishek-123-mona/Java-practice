// import java.util.Scanner;

// //sum fo two exponents of two numbers
// public class TwoExponent {
// static double sum1;
// static double sum2;

// public static void main(String[] args) {
// double r = 0, p = 0;
// for (double i = 0; i < 1; i++) {

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number");
// double n = sc.nextDouble();
// System.out.println("Enter the exponent");
// double e = sc.nextDouble();
// System.out.println("Enter the Base");
// double b = sc.nextDouble();
// sum1 = Math.pow(b, e);
// r = sum1 * n;
// }

// for (double j = 0; j < 1; j++) {
// // int p;
// Scanner s2 = new Scanner(System.in);
// System.out.println("Enter the number");
// double x = s2.nextDouble();
// System.out.println("Enter the exponent");
// double m = s2.nextDouble();
// System.out.println("Enter the Base");
// double o = s2.nextDouble();
// sum2 = (double) Math.pow(o, m);
// p = sum2 * x;
// }
// System.out.println("The sum of two exponents is " + (r + p));

// }
// }

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Mantissa;
        int Base, Exponent, temp = 1;
        System.out.println("Enter Mantissa of first Number:");
        double m1 = input.nextDouble();
        System.out.println("Enter base of first Number:");
        int b1 = input.nextInt();
        System.out.println("Enter exponent of first Number:");
        int e1 = input.nextInt();
        System.out.println("Enter Mantissa of second Number:");
        double m2 = input.nextDouble();
        System.out.println("Enter base of second Number:");
        int b2 = input.nextInt();
        System.out.println("Enter exponent of second Number:");
        int e2 = input.nextInt();

        if (e1 == e2) {
            Mantissa = m1 + m2;
            System.out.println("Mantissa = " + Mantissa);
            System.out.println("Base = " + b1);
            System.out.println("Exponent = " + e1);
        } else if (e1 > e2) {
            Exponent = e1 - e2;
            for (int i = 1; i <= Exponent; i++) {
                temp = temp * 10;
            }
            Exponent = temp;
            m1 = m1 * Exponent;
            Mantissa = m1 + m2;
            System.out.println("Mantissa = " + Mantissa);
            System.out.println("Base = " + b1);
            System.out.println("Mantissa = " + e2);
        } else if (e2 > e1) {
            Exponent = e2 - e1;
            for (int i = 1; i <= Exponent; i++) {
                temp = temp * 10;

            }
            Exponent = temp;
            m2 = m2 * Exponent;
            Mantissa = m1 + m2;
            System.out.println("Mantissa = " + Mantissa);
            System.out.println("Base = " + b1);
            System.out.println("Exponent = " + e1);
        }

    }
}