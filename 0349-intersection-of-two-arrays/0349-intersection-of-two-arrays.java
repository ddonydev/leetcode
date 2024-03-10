class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums1){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums2){
            if(map.containsKey(i)){
                list.add(i);
                map.remove(i);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}