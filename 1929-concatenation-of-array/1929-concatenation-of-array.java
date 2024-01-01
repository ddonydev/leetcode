class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        int index = 0;
        while(index < ans.length){
            for(int i = 0; i < nums.length; i++){
                ans[index] = nums[i];
                index++;
            }
        }
        return ans;
    }
}