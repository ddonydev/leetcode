class Solution {
    public int maximumCount(int[] nums) {
        int neg = 0;
        int pos = 0;
        for(int i : nums){
            if(i == 0){
                continue;
            }
            if(i > 0){
                pos++;
            }else{
                neg++;
            }
        }
        
        return pos > neg ? pos : neg;
    }
}