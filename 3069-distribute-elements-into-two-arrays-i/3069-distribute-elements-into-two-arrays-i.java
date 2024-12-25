class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(nums[0]);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(nums[1]);
        
        for(int i = 2; i < nums.length; i++){
            if(arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
        }
        
        return Stream.of(arr1, arr2)
                .flatMap(x -> x.stream())
                .mapToInt(x -> x).toArray();
    }
}