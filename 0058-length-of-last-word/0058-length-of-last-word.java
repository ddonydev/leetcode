class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        
        String[] str = s.split(" ");
        
        for(int i = str.length - 1; i >= 0; i--){
            if(str[i] != " "){
                return str[i].length();
            }else{
                continue;
            }
        }
        
        return 0;
    }
}