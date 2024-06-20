class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = 999999;
        for(int i = 0; i < nums.length; i++){
            if(i + k - 1 >= nums.length) {
                break;
            }
            min = Math.min(min, nums[i + k - 1] - nums[i]);
        }

        
        return min;
    }
}