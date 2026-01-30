public class sortanarray {
    public static void main(String[] args){
        int[] nums = {5,2,3,1};
        sortanarray sc = new sortanarray();
        int[] n = sc.sortArray(nums);
        for(int i = 0; i < nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap nums[j] and nums[j + 1]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
