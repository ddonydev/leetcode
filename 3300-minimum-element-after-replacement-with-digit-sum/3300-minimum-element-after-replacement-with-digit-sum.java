class Solution {
    public int minElement(int[] nums) {
        int answer = Integer.MAX_VALUE;
        for(int i : nums){
            int sum = 0;
            while(i > 0){
                sum += i % 10;
                i /= 10;
            }
            answer = Math.min(answer, sum);
        }
        return answer;
    }
}