class Solution {
    public int findNumbers(int[] nums) {
        int cnt = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 10 && 100 > nums[i]){
                cnt++;
            }else if(nums[i] >= 1000 && nums[i] < 10000){
                cnt++;
            }else if(nums[i] >= 100000 & nums[i] < 1000000){
                cnt++;
            }
        }
        
        return cnt;
    }
}