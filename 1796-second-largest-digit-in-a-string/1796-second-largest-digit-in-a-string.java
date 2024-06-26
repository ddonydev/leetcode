class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
                continue;
            }
            if(!list.contains(s.charAt(i) - '0')){
                list.add(s.charAt(i) - '0');
            }
        }
        
    
        
        Collections.sort(list, Collections.reverseOrder());
        if(list.size() > 1){
            return list.get(1);        
        }else{
            return -1;
        }
    }
}