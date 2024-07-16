class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        
        boolean answer = false;
        
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] % 2 == 0 && nums[i + 1] % 2 != 0){
                answer = true;
            }else if(nums[i] % 2 != 0 && nums[i + 1] % 2 == 0){
                answer = true;
            }else{
                return false;
            }
        }
        return answer;
    }
}