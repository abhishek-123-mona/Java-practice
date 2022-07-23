class Box
{
    double width;
    double height;
    double depth;
    double w,h,d;
    
    // Construct a box with default values
    Box()
    {
        System.out.println("Constructing a Box");
        width = 5;
        height = 5;
        depth = 5;
    }
    
    // Construct a box with specified values
    Box(double w, double h, double d)
    {
        this.w= w;
        this.h = h;
        this.d= d;
    }
    
    // Return volume of box
    double volume()
    {
        return width * height * depth;
    }
    double volume2()
    {
        return w * h * d;
    }
}
class BoxDemo{
    public static void main(String[] args)
    {
        Box mybox1 = new Box();
        Box mybox2 = new Box(10, 20, 15);
        
        System.out.println("mybox1: " + mybox1.volume());
        System.out.println("mybox2: " + mybox2.volume2());
    }
}