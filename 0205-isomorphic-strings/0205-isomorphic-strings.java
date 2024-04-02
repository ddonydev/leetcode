class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<String, Character> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        
        int c1 = 65;
        for(int i = 0; i < s.length(); i++){
            String tmp1 = String.valueOf(s.charAt(i));
            if(!map1.containsKey(tmp1)){
                map1.put(tmp1, (char)c1);
                c1++;
            }
        }
        
        int c2 = 65;
        for(int i = 0; i < t.length(); i++){
            String tmp2 = String.valueOf(t.charAt(i));
            if(!map2.containsKey(tmp2)){
                map2.put(tmp2, (char)c2);
                c2++;
            }
        }
                     
        String str1 = "";
        String str2 = "";
        for(int i = 0; i < s.length(); i++){
            str1 += map1.get(String.valueOf(s.charAt(i)));
            str2 += map2.get(String.valueOf(t.charAt(i)));
        }
        
        if(str1.equals(str2)){
            return true;
        }else{
            return false;
        } 
    }
}