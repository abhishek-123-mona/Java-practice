//how to create custom exception
class AgeInvalidException extends Exception {

    AgeInvalidException() {
        super("Age is invalid !");
    }

    AgeInvalidException(String message) {
        super(message);
    }

}

public class Howtocreate {
    public static void main(String[] args) {
        System.out.println("start......");
        try {
            int sc = Integer.parseInt(args[0]);
            int sc2 = Integer.parseInt(args[1]);
            System.out.println("we have got two numbers");
            int result = sc / sc2;
            System.out.println("the result is" + result);
            if (sc2 < 10) {
                throw new AgeInvalidException("My age is invalid !!");
            }

        } catch (ArithmeticException e) {
            System.out.println("sc is not devided by zero");
            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("please enter a number");
            System.out.println(e.getMessage());

        } catch (AgeInvalidException e) {
            System.out.println("Invalid N2");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("something went wrong");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("end......");
        }

    }

}
