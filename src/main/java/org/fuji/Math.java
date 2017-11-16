package fuji;

public class Math {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sum(int... nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
