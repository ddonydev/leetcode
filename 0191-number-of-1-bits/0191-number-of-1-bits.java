class Solution {
    public int hammingWeight(int n) {
        String bits = Integer.toBinaryString(n);
        
        int cnt = 0;
        for(int i = 0; i < bits.length(); i++){
            if(bits.charAt(i) == '1'){
                cnt++;
            }
        }
        
        return cnt;
    }
}