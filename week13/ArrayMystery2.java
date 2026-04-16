package week13;

public class ArrayMystery2 {
    public static void main(String[] args) {
        arrayMystery2();
    }

    public static void arrayMystery2(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (i % 2 == 0) {
                list[i]++;
            } else {
                list[i]--;
            }
        }
    }
}
