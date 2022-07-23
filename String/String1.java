// String are immutable 
import java.util.*;
public class String1 {
   public static void main(String[] args){
       Scanner s = new Scanner(System.in); 
       System.out.println("Enter Your name");

       String str = s.nextLine();
       System.out.println("Your name is "+str);
       System.out.println("Your name is "+str.length());
for(int i = 0; i < str.length(); i++)
{
    System.out.println("Your name is "+str.charAt(i));

   }
}
}
