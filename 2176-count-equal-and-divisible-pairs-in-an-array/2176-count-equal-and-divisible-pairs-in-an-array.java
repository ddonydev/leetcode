class Solution {
    public int countPairs(int[] nums, int k) {
        int answer = 0;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    int result = i * j;
                    if(result % k == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}