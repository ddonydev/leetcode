class Solution {
    public int minimumChairs(String s) {
        int chair = 0;
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'E'){
                chair++;
            }else {
                chair--;
            }
            cnt = Math.max(cnt, chair);
        }
        return cnt;
    }
}