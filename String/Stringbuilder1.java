import java.util.*;

public class Stringbuilder1 {
   public static void main(String[] args){
       StringBuilder sb = new StringBuilder("Abhishek");
       System.out.println(sb);
       System.out.println(sb.charAt(0));
       sb.setCharAt(0,'p');
         System.out.println(sb);
       sb.insert(2,'n');
         System.out.println(sb);
       sb.delete(2,3);
         System.out.println(sb);
         sb.setCharAt(0,'A');
         sb.append(" S");
         sb.append(" S");
            sb.append(" S");
            System.out.println(sb);
            sb.reverse();
            System.out.println(sb); 


   }
}
