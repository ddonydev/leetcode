class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long answer = 0;
        Arrays.sort(happiness);
        int index = happiness.length - 1;
        int cnt = 0;
        while(cnt < k){
            int tmp = happiness[index] - cnt;
            if (tmp < 0) {
                break;
            }
            answer += tmp;
            cnt++;
            index--;
        }
        
        return answer;
    }
}