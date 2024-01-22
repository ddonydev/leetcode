class Solution {
    public int subtractProductAndSum(int n) {
        String[] str = String.valueOf(n).split("");

        int mul = 1;
        int sum = 0;
        for (String s : str) {
            mul *= Integer.parseInt(s);
            sum += Integer.parseInt(s);
        }
        
        return mul - sum;
    }
}