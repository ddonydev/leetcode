class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        
        for(int i = 0; i <= n; i++){
            String binary = Integer.toBinaryString(i);
            String[] split = binary.split("");
            
            int sum = 0;
            for(int j = 0; j < split.length; j++){
                sum += Integer.parseInt(split[j]);
            }
            
            ans[i] = sum;
        }
        
        return ans;
    }
}