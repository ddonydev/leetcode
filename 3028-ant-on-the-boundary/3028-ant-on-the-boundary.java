class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int sum = 0;
        int answer = 0;
        for(int i : nums){
            sum += i;
            if(sum == 0){
                answer++;
            }
        }
        
        return answer;
    }
}
