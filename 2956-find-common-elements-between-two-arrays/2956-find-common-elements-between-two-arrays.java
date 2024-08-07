class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] answer = new int[2];
        
        int cnt1 = 0;
        for(int i = 0; i < nums1.length; i++){
            boolean flag = false;
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    flag = true;
                }
            }
            if(flag){
                cnt1++;
            }
        }
        answer[0] = cnt1;
        
        int cnt2 = 0;
        for(int i = 0; i < nums2.length; i++){
            boolean flag = false;
            for(int j = 0; j < nums1.length; j++){
                if(nums2[i] == nums1[j]){
                    flag = true;
                }
            }
            if(flag){
                cnt2++;
            }
        }
        
        answer[1] = cnt2;
        
        return answer;
    }
}