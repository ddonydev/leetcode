class Solution {
    public int countKDifference(int[] nums, int k) {
        int cnt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = 0;
            for (int j = i + 1; j < nums.length; j++) {
                sum = Math.abs(nums[i] - nums[j]);
                if(sum == k) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}