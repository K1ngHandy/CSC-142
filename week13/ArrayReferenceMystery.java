package week13;

public class ArrayReferenceMystery {
    public static void main(String[] args) {
        int[] nums = { 2, 4, -1, 3 };
        incrementAll(nums);

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
    }

    public static void incrementAll(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i]++;
        }
    }
}
