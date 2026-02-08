package week3;

public class valuesOfIJK {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int k = 4;
        int x = i + j + k;
        i = x - i - j;
        j = x - j - k;
        k = x - i - k;

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("k: " + k);
    }
}
