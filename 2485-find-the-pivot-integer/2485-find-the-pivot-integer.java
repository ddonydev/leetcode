class Solution {
    public int pivotInteger(int n) {
        int left = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            left += i + 1;
            arr[i] = left;
        }

        int[] arr2 = new int[n];
        int right = 0;
        for (int i = n - 1; i >= 0; i--) {
            right += i + 1;
            arr2[i] = right;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr[i] == arr2[i]){
                    return i + 1;
                }
            }
        }
        
        return -1;
        
    }
}