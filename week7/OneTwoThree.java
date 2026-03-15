package week7;

public class OneTwoThree {
    public static void main(String[] args) {
        int a = 100;
        addOne();
        addTwo(a);
        a = addThreeAndReturnResult(a);
        System.out.println("run: a = " + a + ", b = " + b);
    }

    private static void addOne() {
        int a = 101;
        b++;
        System.out.println("addOne: a = " + a + ", b = " + b);
    }

    private static void addTwo(int a) {
        a += 2;
        b += 2;
        System.out.println("addTwo: a = " + a + ", b = " + b);
    }

    private static int addThreeAndReturnResult(int a) {
        a += 3;
        b += 3;
        System.out.println("addThreeAndReturnResult: a = " + a + ", b = " + b);
        return a;
    }

    /* Private instance variable */
    private static int b = 200;
}
