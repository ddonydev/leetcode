class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            if(map.containsKey(nums1[i][0])){
                map.put(nums1[i][0], map.get(nums1[i][0]) + nums1[i][1]);
            }else{
                map.put(nums1[i][0], nums1[i][1]);
            }
        }
        
        for(int i = 0; i < nums2.length; i++){
            if(map.containsKey(nums2[i][0])){
                map.put(nums2[i][0], map.get(nums2[i][0]) + nums2[i][1]);
            }else{
                map.put(nums2[i][0], nums2[i][1]);
            }
        }
        
        int[][] answer = new int[map.size()][2];
        int index = 0;
        for(Integer key : map.keySet()){
            answer[index][0] = key;
            answer[index][1] = map.get(key);
            index++;
        }
        Arrays.sort(answer, (o1, o2) -> {
            return o1[0] - o2[0];
        });
        return answer;
    }
}