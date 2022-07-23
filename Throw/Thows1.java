// the throw indicate what exception type may be thrown by a method
// Syntex-->return_type of method(() throws exception_type;
// it is use to declare an exception that means it give a message to the user
// there may upper a exception
class Thows1 {
    public static void show(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Sorry ! invalid !!");
        } else {
            System.out.println("My age is valid");
        }
    }

    public static void main(String[] args) {
        show(15);
    }
}