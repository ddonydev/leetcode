class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        int len = nums.length;
        int answer = 0;
        int index = 0;
        for(int i = 0; i <= len; i++){
            if(i >= len || i != nums[index]){
                answer = i;
                break;
            }
            index++;
        }
        return answer;
    }
}