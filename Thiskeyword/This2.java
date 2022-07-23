
class Gifttaker
{
    public void accept(Gifttaker ob){
        System.out.println("Gift is sent");
    }
}
class Gifttaker1{
    // public class This2 {
        public void sendbox(){
            Gifttaker ob=new Gifttaker();
            ob.accept();
        }
    // }
   public static void main(String[] args){
        This2 t=new This2();
        t.sendbox();
    }
}
