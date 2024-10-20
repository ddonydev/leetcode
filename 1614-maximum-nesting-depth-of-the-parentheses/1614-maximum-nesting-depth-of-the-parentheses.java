class Solution {
    public int maxDepth(String s) {
        int len = s.length();
        int x = 0;
        int cnt = 0;
        for(int i = 0; i < len; i++){
            if(s.charAt(i) == '('){
                x++;
            }
            cnt = Math.max(x, cnt);
            if(s.charAt(i) == ')'){
                x--;
            }

        }
        return cnt;
    }
}