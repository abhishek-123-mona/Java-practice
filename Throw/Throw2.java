//throw keyword-->The throw keyword use to create a custom errow that means it use to throw an excception expisitly
//the thrw key use to together with exception type the exception type is offen use together with a custom method
//syntex------>throw new Exception_class("Message");

public class Throw2 {
    public static void show(int age) {
        if (age < 18) {
            throw new ArithmeticException("Sorry ! invalid !!");
        } else {
            System.out.println("My age is valid");
        }
    }

    public static void main(String[] args) {
        // try {
        // int age = Integer.parseInt(args[0]);
        show(15);

    }

}
/