class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        int cnt = 1;
        for (int i = 1; i < keySet.size(); i++) {
            if(map.get(keySet.get(0)) != map.get(keySet.get(i))) {
                break;
            }
            cnt++;
        }
        
        return map.get(keySet.get(0)) * cnt;
    }
}