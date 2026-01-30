public class countarr {
    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        int count = 0;
        for(int i = 0; i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if (nums[i]==nums[j]) {
                    result[count]=nums[i];
                    count++;
                }
            }
        }


        return result;
    
    }
    public static void main(String[] args) {
        countarr counter = new countarr();
        int[] nums = {4, 5, 9, 4, 7, 9};  // Sample input array
        int[] sneakyNumbers = counter.getSneakyNumbers(nums);

        System.out.println("Duplicate numbers found:");
        for (int num : sneakyNumbers) {
            System.out.println(num);
        }
    }
    
}



