class Solution {
    public int countVowelSubstrings(String word) {
        int cnt = 0;
        HashSet<Character> tmp = new HashSet<>();
        tmp.add('a');
        tmp.add('e');
        tmp.add('i');
        tmp.add('o');
        tmp.add('u');
        for(int i = 0; i < word.length(); i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = i; j < word.length(); j++){
                if(!tmp.contains(word.charAt(j))){
                    break;
                }
                set.add(word.charAt(j));
                if(set.size() == 5){
                    cnt++;
                }
            }
            set.clear();
        }
        
        return cnt;
    }
}