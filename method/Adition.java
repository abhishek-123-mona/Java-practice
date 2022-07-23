public class Adition {
    public int sum(int a, int b) {
        int s=a+b;
        return s;
       
    }
        public static void main(String[] args){
            // int a = 10;
            // int b = 20;
            Adition a = new Adition();
            int c = a.sum(20, 30);
            System.out.println(c);
        }
}
