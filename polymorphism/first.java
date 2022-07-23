//compile time polymorphism we can use the same method name in different class but with different signature 
// and different return type and different number of parameters and different order of parameters. means overloading
// and overriding.

//run time polymorphism we means overriding.
import over.Student;

public class first {
    public static void main(String[] args) {
        Student s = new Student();
        s.read("xyz");
        System.out.println("This is testing");
    }
}
