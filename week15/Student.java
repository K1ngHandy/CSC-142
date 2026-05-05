package week15;

public class Student {
    private String name;
    private int id;
    private int units;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.units = 0;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public int getUnits() {
        return units;
    }

    public void incrementUnits(int units) {
        this.units += units;
    }

    public boolean hasEnoughUnits() {
        return this.units >= 180;
    }

    public String toString() {
        return name + " (#" + id + ")";
    }

    public static void main(String[] args) {
        Student s1 = new Student("Nick", 42342);
        Student s2 = new Student("Marty", 1234);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
