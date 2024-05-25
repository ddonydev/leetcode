class Solution {
    public int findPermutationDifference(String s, String t) {
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++){
            int index = t.indexOf(s.charAt(i));
            answer += Math.abs(i - index);
        }
        
        return answer;
    }
}