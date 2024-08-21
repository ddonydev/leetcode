class Solution {
    public int minOperations(int[] nums) {
        if(nums.length < 2){
            return 0;
        }
        int cnt = 0;
        while(true){
            int isOk = 0;
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] >= nums[i + 1]){
                    nums[i + 1] += 1;
                    cnt++;
                }else{
                    isOk++;
                }
            }
            if(isOk == nums.length - 1){
                break;
            }
        }
        return cnt;
    }
}