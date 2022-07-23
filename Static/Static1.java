class Static1
{
   int x;  //instttace variable
    static int y; //static variable

    void fun(){ 
        x=4; //here x not we put beacause this instance variable but rules is thst we can access class ke static variable kyoki satic method without object call ho jata hai
        y=4;//this is correct because this is static clas variable
    }
    class Static2  //  we can creat inner class use by static
    {

    }
    //  void fun2()
    //  {
    //     //  static int a=3;  we can not declare static in method
    //  }
   public static void main(String[] args)
    {
        Static1 sc=new Static1();//here not x&y variable acces because x&y class variable 
        Static1.y=10;//this the we acces tha static y& and othe variable
        sc.x=20;
        System.out.println(x);
        System.out.println(y);
    }

}