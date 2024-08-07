class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
          if(word.length != pattern.length()) {
              return false;
          }
        
        HashMap<Character, String> map = new HashMap<>();
        for(int i = 0; i < word.length; i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(map.containsValue(word[i])){
                    return false;
                }
                map.put(pattern.charAt(i), word[i]);
            }else{
                if(!map.get(pattern.charAt(i)).equals(word[i])){
                    return false;
                }
            }
        }
        return true;
    }
}