class Solution {
    public int maxScore(String s) {
        int zero = 0;
        int answer = 0;
        for(int i = 0; i < s.length() - 1; i++){
            int one = 0;
            if(s.charAt(i) == '0'){
                zero += 1;
            }
            for(int j = i + 1; j < s.length(); j++){
                if(s.charAt(j) == '1'){
                    one += 1;
                }
            }
            answer = Math.max(answer, zero + one);
        }
        return answer;
    }
}