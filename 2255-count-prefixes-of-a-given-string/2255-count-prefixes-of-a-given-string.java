class Solution {
    public int countPrefixes(String[] words, String s) {
        String[] str = s.split("");
        
        String tmp = "";
        int cnt  = 0;
        for(int i = 0; i < str.length; i++){
            tmp += str[i];
            for(int j = 0; j < words.length; j++){
                if(tmp.equals(words[j])){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}