class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }

        Collections.sort(odd, Collections.reverseOrder());
        Collections.sort(even);

        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                nums[i] = even.get(i / 2);
            }else{
                nums[i] = odd.get(i / 2);
            }
        }
        
        return nums;
        
    }
}