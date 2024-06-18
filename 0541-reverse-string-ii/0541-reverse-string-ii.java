class Solution {
    public String reverseStr(String s, int k) {
        String str = "";
        for (int i = 0; i < s.length(); i+=k) {
            if (i % (2 * k) == 0) {
                str = str + new StringBuilder(
                    s.substring(i, Math.min(i + k, s.length())))
                    .reverse().toString();
            }else{
                str = str + s.substring(i, Math.min(i + k, s.length()));
            }
        }
        
        return str;
        
    }
}