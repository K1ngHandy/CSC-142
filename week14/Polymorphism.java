package week14;

public class Polymorphism {
    public Polymorphism() {
        System.out.println("_");
    }

    public Polymorphism(int i) {
        System.out.println(i);
    }

    public Polymorphism(double d) {
        System.out.println(d);
    }

    public Polymorphism(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Polymorphism p1 = new Polymorphism();
        Polymorphism p2 = new Polymorphism(42);
        Polymorphism p3 = new Polymorphism(3.14);
        Polymorphism p4 = new Polymorphism("Hello");
    }
}
