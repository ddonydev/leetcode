class Solution {
    public int waysToSplitArray(int[] nums) {
        long first = 0;
        long second = 0;
        for(int i : nums){
            second += i;
        }

        int cnt = 0;
        for(int i = 0; i < nums.length - 1; i++){
            first += nums[i];
            second -= nums[i];
            if(first >= second){
                cnt++;
            }
        }
        return cnt;
    }
}