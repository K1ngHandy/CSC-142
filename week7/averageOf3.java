public class averageOf3 {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int c = 13;

        double result = averageOf3(a, b, c);
        System.out.print(result);
    }

    public static double averageOf3(int a, int b, int c) {
        double average = (a + b + c) / 3.0;
        return average;
    }
}
