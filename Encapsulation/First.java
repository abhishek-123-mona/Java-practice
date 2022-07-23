public class First {
    private String name;
    private int age;

    public First(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        First f = new First("John", 20);
        System.out.println(f.getName());
        System.out.println(f.getAge());
        f.setName("Jane");
        f.setAge(30);
        System.out.println(f.getName());
        System.out.println(f.getAge());

    }
}
