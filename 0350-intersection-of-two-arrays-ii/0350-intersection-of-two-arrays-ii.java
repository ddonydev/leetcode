class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int i = 0;  i < nums1.length; i++){
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
        }

        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i = 0;  i < nums2.length; i++){
            if(map1.containsKey(nums2[i])){
                map2.put(nums2[i], map2.getOrDefault(nums2[i], 0) + 1);
            }
        }

        List<Integer> keySet = new ArrayList<>(map2.keySet());

        ArrayList<Integer> list = new ArrayList<>();
        for (Integer key : keySet) {
            if(map1.get(key) >= map2.get(key)){
                for (int i = 0; i < map2.get(key); i++) {
                    list.add(key);
                }
            }else{
                for (int i = 0; i < map1.get(key); i++) {
                    list.add(key);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}