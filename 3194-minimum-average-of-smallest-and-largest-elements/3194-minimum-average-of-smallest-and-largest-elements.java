class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        double answer = Integer.MAX_VALUE;
        while(left <= right){
            answer = Math.min(answer, (nums[left] + nums[right]) / 2.0);
            left++;
            right--;
        }
        
        return answer;
    }
}