//Define exception propagation
//Assertion in java—→The keyword assert is use to achieve assertion in java
//Assertion is use to test your assumption to about the program that means assertion in java help to detect bugs 
//by testing code we "assume to be true " by excuting assertion is believe to true if it face,jvm will throw 
//an error named AssertionError it is mainly use for testing purpose and provide 
//to detect and correct programming error
// Syntex---->1-assert Expression1;2-assert expression;expression2;
// public class Assert1{
//     public static void main(String[] args) {

//         String Weeked[]={"friday","sat","sun"};
//         assert Weeked.length===2;
//         System.out.println("There are"+"Weeked.length"+"weekend in a week");

//     }

// }

class Sample {
    public static void main(String[] args) {

        int value = 13;
        assert value >= 15 : "Not valide age";
        System.out.println("you can vote");
    }
}