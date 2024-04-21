class Solution {
    public void reverseString(char[] s) {
        char[] c = Arrays.copyOf(s, s.length);
    
        int index = 0;
        for(int i = c.length - 1; i >= 0; i--){
            s[index++] = c[i];
        }
    
    }
}