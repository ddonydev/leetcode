class Solution {
    public boolean isPowerOfTwo(int n) {

        for (int i = 0; i < 100; i++) {
            if ((long)n == Math.pow(2, i)) {
                return true;
            }
        }
        
        return false;
    }
}