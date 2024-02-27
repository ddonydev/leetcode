class Solution {
    public int largestAltitude(int[] gain) {
        int current= 0;
        int high = current;

        for (int g : gain) {
          current += g;

          high = Math.max(high, current);
        }

    return high;
    }
}