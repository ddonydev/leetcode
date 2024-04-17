class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] answer = new int[nums.length];
        
        int start = 0;
        int end = nums.length - 1;
        
        for(int i : nums){
            if(i % 2 == 0){
                answer[start++] = i;
            }else{
                answer[end--] = i;
            }
        }
        
        return answer;
    }
}