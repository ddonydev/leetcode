class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        int cnt = 0;
        for(int i = left; i <= right; i++){
            if(set.contains(words[i].charAt(0)) 
               && set.contains(words[i].charAt(words[i].length()- 1))){
                cnt++;
            }
        }
               
               return cnt;
    }
}