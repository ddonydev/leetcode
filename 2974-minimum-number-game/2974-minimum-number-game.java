class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        
        int len = nums.length;
        for(int i = 0; i < len - 1; i += 2){
            int tmp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = tmp;
        }
        
        
        return nums;
    }
}