class Solution {
    public int minimumSum(int num) {
        String s = String.valueOf(num);
        String[] str = s.split("");

        Arrays.sort(str);

        int num1 = Integer.parseInt(str[0] + str[2]);
        int num2 = Integer.parseInt(str[1] + str[3]);
        
        return num1 + num2;
        
    }
}

    