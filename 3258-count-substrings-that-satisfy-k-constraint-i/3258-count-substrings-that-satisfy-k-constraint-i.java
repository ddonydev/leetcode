class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int len = s.length();
        int answer = 0;
        
        for(int i = 0; i < len; i++){
            int zero = 0;
            int one = 0;
            
            for(int j = i; j < len; j++){
                if(s.charAt(j) == '0'){
                    zero++;
                }else{
                    one++;
                }
                if(zero <= k || one <= k){
                    answer++;
                }
            }
        }
        return answer;
    }
}