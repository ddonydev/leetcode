class Solution {
    public int minTimeToType(String word) {
        int time = word.length();
        char curr = 'a';
        for(int i = 0; i < word.length(); i++){
            char pointer = word.charAt(i);
            int diff = Math.abs(pointer - curr);
            time += Math.min(diff, 26 - diff);
            curr = pointer;
        }
        return time;
    }
}