class Solution {
    public int maximizeSum(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        Arrays.sort(nums);
        
        int n = nums[nums.length - 1];
        
        int index = 0;
        int answer = 0;
        while(index < k){
            answer += n;
            n++;
            index++;
        }
        return answer;
    }
}