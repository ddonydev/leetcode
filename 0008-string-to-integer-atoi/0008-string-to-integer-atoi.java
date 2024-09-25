class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int flag = 1;
        long num = 0;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            flag = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            num = num * 10 + (s.charAt(i) - '0');
            i++;
            
            if (num * flag > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (num * flag < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int) (num * flag);
    }
}

 