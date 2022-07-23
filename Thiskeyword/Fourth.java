public class Fourth {
    int i;
    Fourth() {
        System.out.println("Fourth");
    }
    Fourth(int i) {
        // this.i=i;
        System.out.println("Fourthi);

        this();
    }

        public static void main(String[] args)
        {
            Fourth obj = new Fourth(100);

        }
}

