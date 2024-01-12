class Solution {
    public int smallestEvenMultiple(int n) {
        int gcd = getGCD(n, 2);

        return (n * 2) / gcd;
    }
    
    static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }

        return getGCD(num2, num1 % num2);
    }
}