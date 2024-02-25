class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = 0;
        if (arr.length % 2 == 0) {
            len = arr.length - 1;
        }else{
            len = arr.length;
        }
        int curLen = 1;
        int cnt = 0;

        int sum = 0;
        while (curLen <= len) {
            for (int i = 0; i < arr.length; i++) {
                if (i > (arr.length - curLen)) {
                    break;
                }
                for (int j = i; j < arr.length; j++) {
                    if (cnt == curLen) {
                        break;
                    }
                    sum += arr[j];
                    cnt++;
                }
                cnt = 0;
            }
            curLen += 2;
        }
        return sum;
    }
}