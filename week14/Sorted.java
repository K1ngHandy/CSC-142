package week14;

public class Sorted {
    public static void main(String[] args) {
        double[] list = { 1.5, 4.3, 7.0, 19.5, 25.1, 46.2 };

        System.out.println(sorted(list));
    }

    public static boolean sorted(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
