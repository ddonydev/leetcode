class Solution {
    public int countOdds(int low, int high) {
        int answer = 0;
        
        if(low % 2 != 0 || high % 2 != 0){
            answer++;
        }
        
        return (high - low) / 2 + answer; 
    }
}