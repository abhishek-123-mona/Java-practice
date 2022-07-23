public class First {
    public int a;

    public int abhi()
    {
        return 4;
    }
    public void abhi2()
    {
        System.out.println("I am in abhi2 method first"); 
    }
}
    class Second extends First {
        @Override
        public void abhi2()
        {
            System.out.println("I am in abhi2 method Second"); 
        }
        public void abhi3(){
            System.out.println("I am in abhi3 method second");
        }

    }
     class Third{
      
       public static void main(String[] args){
              First f=new First();
              f.abhi2();
              Second s=new Second();
              s.abhi2();
       }
}
