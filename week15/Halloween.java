package week15;

public class Halloween {
    public static void main(String[] args) {
        int halloweenTown = 10;
        Skeleton bones = new Skeleton("bones");
        Pumpkin king = new Pumpkin(halloweenTown, bones);
        Skeleton skellington = bones;
        skellington.setName("skellington");
        halloweenTown = 5;
        System.out.println(king.toString());
    }
}
