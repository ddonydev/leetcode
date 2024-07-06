class Solution {
    public int passThePillow(int n, int time) {
        int answer = 1;
        while (time > 0){
            if(answer < n){
                while (answer < n){
                    time -= 1;
                    answer += 1;
                    if (time <= 0){
                        break;
                    }
                }
            }else {
                while (answer > 1){
                    time -= 1;
                    answer -= 1;
                    if (time <=  0){
                        break;
                    }
                }
            }
        }
        return answer;
    }
}