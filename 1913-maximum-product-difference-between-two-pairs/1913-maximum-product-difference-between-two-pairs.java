class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        
        int n1 = nums[0] * nums[1];
        int n2 = nums[nums.length - 1] * nums[nums.length -2];
        
        return n2 - n1;
    }
}