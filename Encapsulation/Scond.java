public class Scond {
    private String name;
    private int age;

    public void Scond1(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age can't be negative");
        }
        // this.name = name;
        this.age = age;
        System.out.println("Constructor called dd");
    }

    public static void main(String[] args) {
        Scond f = new Scond();
        f.Scond1(20);
        System.out.println(f.age);

    }

}
