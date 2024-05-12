class Solution {
    public int sumBase(int n, int k) {
        String c = Integer.toString(n, k);
        
        int answer = 0;
        for(int i = 0; i < c.length(); i++){
            answer += c.charAt(i) - '0';
        }
        return answer;
    }
}