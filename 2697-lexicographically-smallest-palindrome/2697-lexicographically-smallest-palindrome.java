class Solution {
    public String makeSmallestPalindrome(String s) {
        int index = 0;
        int len = s.length() - 1;
        char[] arr = s.toCharArray();
        while(index <= len){
            if(arr[index] != arr[len]){
                arr[index] = arr[len] = (char) Math.min(arr[index], arr[len]);
            }
            index++;
            len--;
        }
        return new String(arr);
    }
}