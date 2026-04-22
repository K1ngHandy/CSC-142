package week14;

public class Vehicle {
    int modelYear;
    String modelName;

    public Vehicle(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Vehicle myCar = new Vehicle(2013, "Abarth");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
