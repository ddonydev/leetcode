class Solution {
    public boolean divideArray(int[] nums) {
        int pair = nums.length / 2;
        
        Arrays.sort(nums);
        
        int cnt = 0;
        for(int i = 0; i < nums.length; i += 2){
            if(nums[i] == nums[i + 1]){
                cnt++;
            }
        }
        
        if(pair == cnt){
            return true;
        }else{
            return false;
        }
    }
}