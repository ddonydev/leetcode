class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int x = s.lastIndexOf(c);

            if (i != x) {
                int distanceValue = x - i - 1;
                if (distance[c - 'a'] != distanceValue) {
                    return false;
                }
            }
            
        }

        return true;
    }
}