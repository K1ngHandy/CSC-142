package week15;

public class Pumpkin {
    private int x;
    private Skeleton y;

    public Pumpkin(int z, Skeleton w) {
        x = z;
        y = w;
    }

    public String toString() {
        return y.getName() + " " + x;
    }
}
