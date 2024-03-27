class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            int tmp = nums[i];
            if (i == nums.length - 1 && tmp < k) {
                cnt++;
                break;
            }
            if(tmp < k){
                cnt++;
            }
            
            for(int j = i + 1; j < nums.length; j++){
                tmp *= nums[j];
                if(tmp >= k){
                    break;
                }
                cnt++;
            }
        }
        return cnt;
    }
}