public class First {
    public static void main(String[] args) {
        System.out.println("start......");
        try {
            int sc = Integer.parseInt(args[0]);
            int sc2 = Integer.parseInt(args[1]);
            System.out.println("we have got two numbers");
            int result = sc / sc2;
            System.out.println("the result is" + result);
        } catch (ArithmeticException e) {
            System.out.println("sc is not devided by zero");
            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("please enter a number");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("something went wrong");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("end......");
        }

    }
}
