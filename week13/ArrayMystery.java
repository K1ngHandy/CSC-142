package week13;

public class ArrayMystery {
    public static void main(String[] args) {
        System.out.println(arrayMystery());
    }

    public static void arrayMystery(int[] list) {
        for (int i = 1; i < list.length; i++) {
            list[i] = list[i] + list[i - 1];
        }
    }
}
