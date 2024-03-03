class Solution {
    public int countAsterisks(String s) {
        int cnt = 0;

        String[] str = s.split("\\|");

        for (int i = 0; i < str.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < str[i].length(); j++) {
                    if (str[i].charAt(j) == '*') {
                        cnt++;
                    }
                }
            }
        }
        
        return cnt;
    }
}