class Solution {
    public int numberOfMatches(int n) {
        int answer = 0;
        while (n != 1) {
            int game = n;
            if (n % 2 == 0) {
                n /= 2;
                game /= 2;
            }else{
                n = ((n - 1) / 2) + 1;
                game = (game - 1) / 2;
            }
            answer += game;
        }
        return answer;
    }
}