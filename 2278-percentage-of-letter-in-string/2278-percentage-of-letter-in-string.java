class Solution {
    public int percentageLetter(String s, char letter) {
        
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                cnt++;
            }
        }
        
        double answer = Math.floor(((double) cnt / (double)s.length()) * 100.0);
        return (int)answer;
        
    }
}