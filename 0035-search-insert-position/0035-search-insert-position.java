class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = searchArr(nums, target);
        if(result != -1){
            return result;
        }else{
            int[] arr = new int[nums.length + 1];
            for(int i = 0; i < arr.length; i++){
                if(i == arr.length - 1){
                    arr[i] = target;
                    break;
                }
                arr[i] = nums[i];            
            }
            Arrays.sort(arr);
            return searchArr(arr, target);
        }
        
    }
    public int searchArr(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}