class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            if(!list.contains(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        
        int n = map.get(list.get(0));
        for(int i = 1; i < list.size(); i++){
            if(n != map.get(list.get(i))){
                return false;
            }
        }
        
        return true;
        
        
    }
}