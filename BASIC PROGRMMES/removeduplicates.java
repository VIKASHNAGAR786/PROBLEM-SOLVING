class removeduplicates {
    public int removeduplicates1(int[] nums) {
        if (nums.length == 0) return 0; // Handle the edge case for empty array
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        removeduplicates solution = new removeduplicates();

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength = solution.removeduplicates1(nums);

        System.out.println("The new length is: " + newLength);
        System.out.print("The array with duplicates removed: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
