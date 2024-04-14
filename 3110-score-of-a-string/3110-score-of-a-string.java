class Solution {
    public int scoreOfString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i <= 25; i++){
            char c = (char)(i + 97);
            
            map.put(c, (int)c);
        }
        
        int result = 0;
        for(int i = 0; i < s.length() - 1; i++){
            int num = Math.abs(s.charAt(i) - s.charAt(i + 1));
            result += num;
        }
        
        return result;
    }
}