class Solution {
    public boolean isSameAfterReversals(int num) {
        String n = Integer.toString(num);

        StringBuilder sb = new StringBuilder(n);
        sb.reverse();

        int n2 = Integer.parseInt(sb.toString());
        StringBuilder sb2 = new StringBuilder(Integer.toString(n2));
        sb2.reverse();

        if (num == Integer.parseInt(String.valueOf(sb2))) {
            return true;
        }else{
            return false;
        }
    }
}