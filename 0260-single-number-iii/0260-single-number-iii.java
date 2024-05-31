class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int[] answer = new int[2];
        int index = 0;
        for(int i : nums){
            if(map.get(i) == 1){
                answer[index++] = i;
            }
            if(index == 2){
                break;
            }
        }
        
        return answer;
    }
}