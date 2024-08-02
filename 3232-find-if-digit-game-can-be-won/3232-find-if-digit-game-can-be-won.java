class Solution {
    public boolean canAliceWin(int[] nums) {
        int s_digit = 0;
        int d_digit = 0;
        for(int i : nums){
            if(i < 10){
                s_digit += i;
            }else{
                d_digit += i;
            }
        }
        
        if(s_digit != d_digit){
            return true;
        }
        return false;
    }
}