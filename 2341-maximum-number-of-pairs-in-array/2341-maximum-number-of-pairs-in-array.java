class Solution {
    public int[] numberOfPairs(int[] nums) {
        int pair = 0;
        
        boolean[] find = new boolean[nums.length];
        for(int i = 0; i < nums.length - 1; i++){
            int n = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == n && !find[i] && !find[j]){
                    pair++;
                    find[i] = true;
                    find[j] = true;
                    break;
                }
            }
        }

        int n = 0;
        for(boolean b : find){
            if(!b){
                n++;
            }
        }
        
        return new int[]{pair, n};
    }
}