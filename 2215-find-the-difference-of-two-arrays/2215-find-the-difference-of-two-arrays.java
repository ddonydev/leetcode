class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
    
        List<Integer> n1 = new ArrayList<>();
        List<Integer> n2 = new ArrayList<>();

        for(int i : nums1){
            boolean flag = true;
            for(int j : nums2){
                if(i == j){
                    flag = false;
                }
            }
            if(flag && !n1.contains(i)){
                n1.add(i);
            }
        }
        
        for(int i : nums2){
            boolean flag = true;
            for(int j : nums1){
                if(i == j){
                    flag = false;
                }
            }
            if(flag && !n2.contains(i)){
                n2.add(i);
            }
        }
        
        list.add(n1);
        list.add(n2);
        
        return list;
    }
}