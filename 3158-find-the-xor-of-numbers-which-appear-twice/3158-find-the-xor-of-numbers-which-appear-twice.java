class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int answer = 0;
        for (Integer i : map.keySet()) {
            if (map.get(i) == 2) {
                answer ^= i;
            }
        }
        
        return answer;
    }
}