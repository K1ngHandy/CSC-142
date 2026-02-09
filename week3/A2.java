package week3;

public class A2 {
    public static void main(String[] args) {
        // Displacement formula: s = s₀ + v₀t + ½at²
        double initialPosition = 12.0; // s₀ in meters
        double initialVelocity = 3.5; // v₀ in m/s
        double acceleration = 9.8; // a in m/s² (gravity)
        double time = 10.0; // t in seconds

        // Calculate final displacement
        double displacement = initialPosition + initialVelocity * time + 0.5 * acceleration * time * time;

        System.out.println("Final displacement: " + displacement + " meters");
    }
}
