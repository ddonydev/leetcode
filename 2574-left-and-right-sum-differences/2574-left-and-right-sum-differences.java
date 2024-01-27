class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        int leftSum = 0;
        left[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            left[i] = leftSum;
            leftSum += nums[i];
        }

        int rightSum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            right[i] = rightSum;
            rightSum += nums[i];
        }

        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = Math.abs(left[i] - right[i]);
        }
        
        return answer;
    }
}
