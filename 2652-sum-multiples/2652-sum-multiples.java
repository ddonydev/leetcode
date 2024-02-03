class Solution {
    public int sumOfMultiples(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0){
                answer += i;
            }else if(i % 5 == 0){
                answer += i;
            }else if(i % 7 == 0){
                answer += i;
            }
        }
        return answer;
    }
}