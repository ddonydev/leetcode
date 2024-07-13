class Solution {
    public boolean digitCount(String num) {
        String[] s = num.split("");

        HashMap<String, Integer> map = new HashMap();
        for(int i = 0; i < s.length; i++){
            map.put(s[i], map.getOrDefault(s[i], 0) + 1);
        }

        boolean answer = false;
        for(int i = 0; i < s.length; i++){
            if (!map.containsKey(String.valueOf(i))) {
                if (Integer.parseInt(s[i]) == 0) {
                    answer = true;
                }else{
                    return false;
                }
            }else{
                if (Integer.parseInt(s[i]) == map.get(String.valueOf(i))) {
                    answer = true;
                } else {
                    return false;
                }
            }
        }
        
        return answer;
    }
}