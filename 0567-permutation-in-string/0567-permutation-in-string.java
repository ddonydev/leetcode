class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len = s1.length();

        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);
        s1 = new String(s1Arr);
        
        for(int i = 0; i <= s2.length() - len; i++){
            String tmp = s2.substring(i, i + len);
            char[] tmpArr = tmp.toCharArray();
            Arrays.sort(tmpArr);
            tmp = new String(tmpArr);
            if(tmp.equals(s1)){
                return true;
            }
        }
        
        return false;
    }
}