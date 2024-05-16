class Solution {
    public String generateTheString(int n) {
        String answer = "";
        if(n % 2 == 0){
            for(int i = 0; i < n - 1; i++){
                answer += "a";
            }
            answer += "b";
        }else{
            for(int i = 0; i < n; i++){
                answer += "a";
            }
        }
        
        return answer;
    }
}