import java.util.Scanner;
import java.io.*;

class Password {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Email id: ");
        String email = sc.nextLine();
        System.out.println("Enter your password: ");
        Console console = System.console();
        char[] pass = console.readPassword();
        String passwords = new String(pass);
        if (email.equals("abhisheksharma25801@gmail.com") && passwords.equals("joker123")) {
            System.out.println("Login Successful.......");
            System.out.println("*************Welcome to the world of Java*************");

        } else {
            System.out.println("Access denied");
        }
    }

}
