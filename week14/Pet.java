package week14;

public class Pet {
    public String name;
    public int age;
    public double weight;

    public Pet(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
    }

    public Pet(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Pet() {
        this("Buddy", 1, 12.0);
    }

    public static void main(String[] args) {
        Pet p = new Pet();
        p.name = "no name yet";
        p.age = 1;
        p.weight = 100;
    }
}
