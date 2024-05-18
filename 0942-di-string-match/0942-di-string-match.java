class Solution {
    public int[] diStringMatch(String s) {
        int min = 0;
        int max = s.length();
        
        int[] answer = new int[s.length() + 1];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'I'){
                answer[i] = min;
                min++;
            }else{
                answer[i] = max;
                max--;
            }
        }
        answer[s.length()] = max;
        return answer;
    }
}