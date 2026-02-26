package week6;

public class bottlesOfRootBeer {
    public static void main(String[] args) {
        for (int bottles = 10; bottles >= 0; bottles--) {
            if (bottles > 0) {
                System.out.println(bottles + " bottles of root beer on the wall");
                System.out.println(bottles + " bottles of root beer");
                System.out.println("Take one down, pass it around");
                System.out.println(bottles - 1 + " bottles of root beer on the wall");
                System.out.println();
            }
        }
    }
}
