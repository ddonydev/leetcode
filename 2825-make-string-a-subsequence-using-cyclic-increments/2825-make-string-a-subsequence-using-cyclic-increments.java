class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int s1 = str1.length();
        int s2 = str2.length();
        
        int j = 0;
        for(int i = 0; i < s1 &&  j < s2; i++){
            int x = str1.charAt(i);
            int y = str2.charAt(j);
            if(x == y || x + 1 == y || x - 25 == y){
                j++;
            }
        }
        if(j == s2){
            return true;
        }else {
            return false;
        }
    }
}
