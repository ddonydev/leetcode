class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 0; i < arr.length - 2; i++){
            int cnt = 0;
            if(arr[i] % 2 != 0){
                for(int j = 0; j < 3; j++){
                    if(arr[i + j] % 2 != 0){
                        cnt++;
                    }
                } 
            }
            
            if(cnt == 3){
                return true;
            }
        }
        
        return false;
    }
}