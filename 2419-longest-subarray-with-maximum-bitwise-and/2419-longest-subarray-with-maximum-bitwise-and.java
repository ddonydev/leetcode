class Solution {
    public int longestSubarray(int[] nums) {
        int maxNum = 0;
        int max = 0;
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            maxNum = Math.max(maxNum, nums[i]);
        }
        
        for(int i = 0; i < nums.length; i++){
            if(maxNum == nums[i]){
                cnt++;
            }else{
                max = Math.max(max, cnt);
                cnt = 0;
            }
        }
        max = Math.max(max, cnt);
        if(max == 0){
            return 1;
        }
        return max;
        
    }
}