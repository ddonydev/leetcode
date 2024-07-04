class Solution {
    public int countGoodSubstrings(String s) {
        int cnt = 0;
        for(int i = 0; i < s.length() - 2; i++){
            String tmp = s.charAt(i) + "";
            for(int j = 1; j < 3; j++){
                if(!tmp.contains(s.charAt(i + j) + "")){
                    tmp += String.valueOf(s.charAt(i + j));
                }
            }
            if(tmp.length() == 3){
                cnt++;
            }
        }
        return cnt;
    }
}