class Solution {
    public boolean halvesAreAlike(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
        int half = s.length() / 2;
        
        int cnt1 = 0;
        int cnt2 = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                if(i < half ){
                    cnt1++;
                }else{
                    cnt2++;
                }
            }
        }
        
        return cnt1 == cnt2 ? true : false;
        
        
    }
}