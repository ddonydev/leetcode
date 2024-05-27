class Solution {
    public int specialArray(int[] nums) {
        
        int index = 0;
        while(index < nums.length){
            for(int i = 0; i < nums[index]; i++){
                int n = i + 1;
                int cnt = 0;
                for(int j = 0; j < nums.length; j++){
                    if(n <= nums[j]){
                        cnt++;
                    }
                }
                if(n == cnt){
                    return n;
                }
            }
            index++;
        }
        return -1;
    }
}