class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k > 0){
            int index = 0;
            int min = 99999;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] < min){
                    min = nums[i];
                    index = i;
                }
            }
            nums[index] *= multiplier;
            k--;
        }
        return nums;
    }
}