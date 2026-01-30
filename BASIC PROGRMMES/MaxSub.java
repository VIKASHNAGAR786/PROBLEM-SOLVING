public class MaxSub {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = FindMaxSub(nums);
        System.out.println("The maximum subarray sum is: " + result);
    }

    public static int FindMaxSub(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int current_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            current_sum = Math.max(current_sum + nums[i], nums[i]);
            maxsum = Math.max(maxsum, current_sum);
        }
        return maxsum;
    }
}
