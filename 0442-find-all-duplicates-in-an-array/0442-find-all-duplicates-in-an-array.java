class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>();
        for(Integer i : map.keySet()){
            if(map.get(i) == 2){
                list.add(i);
            }
        }
        
        return list;
    }
}