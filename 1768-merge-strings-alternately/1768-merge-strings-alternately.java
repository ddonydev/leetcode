class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        
        String answer = "";
        
        int index1 = 0;
        int index2 = 0;
        
        int cnt = 0;
        while (cnt < len1 + len2){
            if(index1 < len1){
                answer += word1.charAt(index1);
                index1++;
                cnt++;
            }
            if(index2 < len2){
                answer += word2.charAt(index2);
                index2++;
                cnt++;
            }
        }
        return answer;
    }
}