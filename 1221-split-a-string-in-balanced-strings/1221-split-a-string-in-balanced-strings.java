class Solution {
    public int balancedStringSplit(String s) {
        int cnt = 0;

        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R'){
                cnt++;
            } else {
                cnt--;
            }

            if (cnt == 0) {
                answer++;
            }
        }
        return answer;
    }
}