class Solution {
    public boolean rotateString(String s, String goal) {
        int index = 0;
        while(index < s.length()){
            s = s.substring(1) + s.charAt(0);
            if(s.equals(goal)){
                return true;
            }
            index++;
        }
        return false;
    }
}