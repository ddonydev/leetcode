class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr1 = Arrays.copyOfRange(nums, 0, n);
        int[] arr2 = Arrays.copyOfRange(nums, n, nums.length);

        int i = 0;
        int j = 0;
        while(i < nums.length){
            nums[i] = arr1[j];
            i++;
            nums[i] = arr2[j];
            j++;
            i++;
        }
        return nums;
    }
}