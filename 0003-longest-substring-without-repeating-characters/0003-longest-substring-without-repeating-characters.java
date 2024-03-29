class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        ArrayList<Character> list = new ArrayList<>();
        list.add(s.charAt(0));

        int len = list.size();
        for(int i= 1; i < s.length(); i++){
            if(!list.contains(s.charAt(i))){
                list.add(s.charAt(i));
            }else{
                int index = list.indexOf(s.charAt(i));
                if(index == i - 1){
                    list.clear();
                }else{
                    while (index >= 0){
                        list.remove(0);
                        index--;
                    }
                }
                list.add(s.charAt(i));
            }
            len = Math.max(len, list.size());
        }
        return len;
    }
}