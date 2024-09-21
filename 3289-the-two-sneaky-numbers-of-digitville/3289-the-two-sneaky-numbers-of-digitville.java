class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] answer = new int[2];
        int index = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) == 2){
                answer[index++] = nums[i];
            }
        }
        
        return answer;
        
    }
}