class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int n = 1;
        int answer = 0;
        while (n < 10000){
            int x = num1 % 10;
            int y = num2 % 10;
            int z = num3 % 10;
            
            answer += Math.min(x, Math.min(y, z)) * n;
            n *= 10;
            
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
        }
        
        return answer;
    }
}