class Solution {
    public int differenceOfSum(int[] nums) {
        
        int sum1 = 0;
        int sum2 = 0;
        for(int i : nums){
            sum1 += i;
            if(i > 9){
                int[] temp = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).toArray();
                for(int j : temp){
                    sum2 += j;
                }
            }else{
                sum2 += i;
            }
        }
        
        return Math.abs(sum1 - sum2);
    }
}