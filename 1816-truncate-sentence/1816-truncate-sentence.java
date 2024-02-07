class Solution {
    public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        String answer = "";
        for (int i = 0; i < k; i++) {
            if (i == k - 1) {
                answer += str[i];
            }else{
                answer += str[i] + " ";
            }
        }
        return answer;
    }
}