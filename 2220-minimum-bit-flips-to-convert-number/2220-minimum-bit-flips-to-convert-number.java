class Solution {
    public int minBitFlips(int start, int goal) {
        String s = Integer.toBinaryString(start);
        String g = Integer.toBinaryString(goal);

        int len = Math.abs(s.length() - g.length());
        if (s.length() > g.length()) {
            for (int i = 0; i < len; i++) {
                g = "0" + g;
            }
        }else{
            for (int i = 0; i < len; i++) {
                s = "0" + s;
            }
        }

        int cnt = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != g.charAt(i)){
                cnt++;
            }
        }
        
        return cnt;
    }
}