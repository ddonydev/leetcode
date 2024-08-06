class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list= new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j] && !list.contains(nums2[j])){
                    list.add(nums2[j]);
                }
            }
        }
        
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums3.length; j++){
                if(nums1[i] == nums3[j] && !list.contains(nums3[j])){
                    list.add(nums3[j]);
                }
            }
        }
        
        for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j < nums3.length; j++){
                if(nums2[i] == nums3[j] && !list.contains(nums3[j])){
                    list.add(nums3[j]);
                }
            }
        }
        
        return list;
    }
}